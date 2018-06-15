package domain;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Account {
	public final static String BANK_NAME="비트뱅크";
	public final static String ACCOUNT_TYPE="기본통장";
	public final static String WITHDRAW_SUCCESS="출금성공";
	public final static String WITHDRAW_FAIL="잔액부족";
	public final static String DEPOSIT_SUCCESS="입금성공";
	public final static String DEPOSIT_FAIL="적합한 입력값이 아님";
	protected int money;
	protected String name,uid,password,accountType,accountNo,createDate, deposit, withDraw;
	public Account(String name, String uid, String password) {
		setAccNum();
		setCreateDate();
		setAccType(ACCOUNT_TYPE);
		this.name = name;
		this.uid = uid;
		this.password = password;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public void setPW(String password) {
		this.password = password;
	}
	public void setAccType(String accountType) {
		this.accountType = accountType;
	}
	public void setAccNum() {
		this.accountNo = String.format("%03d-%03d-%03d",(int)(Math.random()*1000),(int)(Math.random()*1000),(int)(Math.random()*1000));	
	}
	public void setCreateDate() {
		this.createDate = new SimpleDateFormat("yyyy년 MM월 dd일").format(new Date());
	}
	public int getMoney() {
		return money;
	}
	public String getName() {
		return name;
	}
	public String getUID() {
		return uid;
	}
	public String getPW() {
		return password;
	}
	public String getAccType() {
		return accountType;
	}
	public String getAccNum() {
		return accountNo;
	}
	public String getCreateDate() {
		return createDate;
	}
	public String toString() {
		return String.format("[%s]\n"
				+ "%s\n"
				+ "생성일 : %s\n"
				+ "계좌번호 : %s\n"
				+ "이름 : %s\n"
				+ "잔액 : %d 원\n"
				, BANK_NAME, accountType, createDate, accountNo, name, money);
	}
}
