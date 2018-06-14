package domain;

public class MinusAccount extends Account {
	public final static String ACCOUNT_TYPE = "마이너스통장";
	public int limit; // 대출하시겠습니까 ? 화면출력. 대출금, 대출한도
	public MinusAccount(String name, String uid, String password) {
		super(name, uid, password);
		setAccType(ACCOUNT_TYPE);
	}
	public void setMoney(int money) {
		this.money = 0 - money;
	}
	public void setLimit(int limit) {
		this.limit = limit * (-1);
	}
	public int getLimit() {
		return limit;
	}
	public String toString() {
		return String.format("[%s]\n %s\n 생성일 : %s\n 계좌번호 : %s\n 이름 : %s\n 잔액 : %d 원\n 대출한도 : %d 원", BANK_NAME,
				accountType, createDate, accountNo, name, money, limit);
	}
}
