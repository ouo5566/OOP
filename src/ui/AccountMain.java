package ui;
import javax.swing.JOptionPane;
import domain.Account;
import domain.MinusAccount;
/**
 * 비트뱅크
 * 기본통장(마이너스통장)
 * 생성일 : 2018-06-10
 * 계좌번호 : 111-111-111
 * 이름 : 홍길동
 * 잔액 : 원
 * 입금하시겠습니까 ? (대출받으시겠습니까?) 
 * */
enum ButtAcc{
	EXIT,
	BASIC_ACCOUNT,
	MINUS_ACCOUNT
}
public class AccountMain {
	public static void main(String[] args) {
		ButtAcc[] buttons = {
				ButtAcc.EXIT,
				ButtAcc.BASIC_ACCOUNT,
				ButtAcc.MINUS_ACCOUNT
				};
		Account acc;
		MinusAccount macc;
		while(true) {
			ButtAcc select = (ButtAcc)JOptionPane.showInputDialog(
					null,
					"어서오세요 비트뱅크입니다.",
					"BIT_BANK",
					JOptionPane.QUESTION_MESSAGE,
					null,
					buttons,
					buttons[0]
					);
			switch(select) {
			case EXIT : return;
			case BASIC_ACCOUNT :
				acc = new Account();
				acc.setName(JOptionPane.showInputDialog("예금주 이름을 입력하세요."));
				acc.setUID(JOptionPane.showInputDialog("사용할 아이디를 입력하세요."));
				acc.setPW(JOptionPane.showInputDialog("사용할 비밀번호를 입력하세요."));
				acc.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금할 금액을 입력하세요.")));
				JOptionPane.showMessageDialog(null,acc.toString());
				break;
			case MINUS_ACCOUNT :
				macc = new MinusAccount();
				macc.setName(JOptionPane.showInputDialog("예금주 이름을 입력하세요."));
				macc.setUID(JOptionPane.showInputDialog("사용할 아이디를 입력하세요."));
				macc.setPW(JOptionPane.showInputDialog("사용할 비밀번호를 입력하세요."));
				macc.setDebt(Integer.parseInt(JOptionPane.showInputDialog("대출할 금액을 입력하세요.")));
				JOptionPane.showMessageDialog(null,macc.toString());
				break;
			}
		}
	}
}
