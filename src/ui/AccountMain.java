package ui;

import javax.swing.JOptionPane;
import domain.*;
import service.*;
import serviceImpl.*;

/**
 * 비트뱅크 기본통장(마이너스통장) 생성일 : 2018-06-10 계좌번호 : 111-111-111 이름 : 홍길동 잔액 : 원
 * 입금하시겠습니까 ? (대출받으시겠습니까?)
 */
enum ButtA {
	EXIT, BASIC_ACCOUNT, MINUS_ACCOUNT, LIST, DEPOSIT, WITHDRAW
}

public class AccountMain {
	public static void main(String[] args) {
		Account acc = null;
		AccountService service = new AccountServiceImpl();

		while (true) {
			switch ((ButtA) JOptionPane.showInputDialog(null, "어서오세요 비트뱅크입니다.", "BIT_BANK",
					JOptionPane.QUESTION_MESSAGE, null,
					new ButtA[] { ButtA.EXIT, ButtA.BASIC_ACCOUNT, ButtA.MINUS_ACCOUNT, ButtA.LIST, ButtA.DEPOSIT, ButtA.WITHDRAW },
					null)) {
			case EXIT:
				return;
			case BASIC_ACCOUNT:
				service.addList(service.createAccount(JOptionPane.showInputDialog("예금주 이름을 입력하세요."),
						JOptionPane.showInputDialog("사용할 아이디를 입력하세요."),
						JOptionPane.showInputDialog("사용할 비밀번호를 입력하세요.")));
				break;
			case MINUS_ACCOUNT:
				acc = new MinusAccount(JOptionPane.showInputDialog("예금주 이름을 입력하세요."),
						JOptionPane.showInputDialog("사용할 아이디를 입력하세요."),
						JOptionPane.showInputDialog("사용할 비밀번호를 입력하세요."));
				((MinusAccount) acc).setLimit(Integer.parseInt(JOptionPane.showInputDialog("대출한도를 설정하세요.")));
				acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("대출할 금액을 입력하세요.")));
				JOptionPane.showMessageDialog(null, acc.toString());
				break;
			case LIST :
				JOptionPane.showMessageDialog(null, service.showResult());
				break;
			case DEPOSIT:
				acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하세요.")));
				JOptionPane.showMessageDialog(null, String.format("잔액 : %d원", acc.getMoney()));
				break;
			case WITHDRAW:
				String result = "";
				int money = Integer.parseInt(JOptionPane.showInputDialog("출금할 금액을 입력하세요."));
				if (acc.getAccType().equals("마이너스통장")) {
					if (money > ((MinusAccount) acc).getLimit()) {
						result = String.valueOf(acc.getMoney() - money);
						result = (Integer.parseInt(result) < ((MinusAccount) acc).getLimit()) ? "대출 한도를 초과하였습니다."
								: String.format("잔액 %s 원", String.valueOf(acc.getMoney() - money));
						;
					} else {
						result = "대출 한도를 초과하였습니다.";
					}
				} else {
					if (money > acc.getMoney()) {
						result = "잔액을 초과하였습니다.";
					} else {
						result = String.format("잔액 %s 원", String.valueOf(acc.getMoney() - money));
					}
				}
				JOptionPane.showMessageDialog(null, String.format("%s", result));
				break;
			}
		}
	}
}
