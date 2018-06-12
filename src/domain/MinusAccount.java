package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE="마이너스통장";
	public int debt; // 대출하시겠습니까 ? 화면출력. 대출금
	public void setDebt(int debt) {
		this.debt = debt;
		setMoney();
	}
	public void setMoney() {
		money = money - debt;
	}
	public int getDebt() {
		return debt;
	}
	public String toString() {
		return String.format("[%s]\n"
				+ "%s\n"
				+ "생성일 : %s\n"
				+ "계좌번호 : %s\n"
				+ "이름 : %s\n"
				+ "잔액 : %d 원\n"
				, BANK_NAME, ACCOUNT_TYPE, createDate, accountNo, name, money);
	}
}
