package service;
import domain.Account;

public interface AccountService {
	public Account createAccount(String name, String uid, String password);
	public void addList(Account account);
	public Account[] list();
	public int deposit(int restMoney, String money);
	public int withdraw(int restMoney, String money);
	public String createAccountNum(String random);
	public String createRandom(int start, int end);
	public String createDate();
	public String showResult();
}
