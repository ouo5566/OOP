package serviceImpl;

import domain.Account;
import service.AccountService; // 비즈니스(실무) 로직 : 현실과 유사한 개념으로 로직으로 주자

public class AccountServiceImpl implements AccountService {
	Account[] list;
	int count;
	
	public AccountServiceImpl() {
		list = new Account[10];
		count = 0;
	}

	@Override
	public void addList(Account account) {
		list[count++] = account;
	}

	@Override
	public Account[] list() {
		return list;
	}

	@Override
	public Account createAccount(String name, String uid, String password) {
		return new Account(name, uid, password);

	}

	@Override
	public int deposit(int restMoney, String money) {

		return 0;
	}

	@Override
	public int withdraw(int restMoney, String money) {

		return 0;
	}

	@Override
	public String createAccountNum(String random) {

		return null;
	}

	@Override
	public String createRandom(int start, int end) {

		return null;
	}

	@Override
	public String createDate() {

		return null;
	}

	@Override
	public String showResult() {
		String result = "";
		for(int i = 0 ; i < count ; i++) {
			result += String.format("%s\n",list()[i].toString());
		}
		return result;
	}
}