package prob05;

public class Account {
	private String accountNo;
	private int balance = 0;
	
	public Account(String account) {
		this.accountNo = account;
		System.out.println(getAccountNo()+ " 계좌가 개설되었습니다.");
		
		
	}

	public int getBalance() {
		return balance;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public void save(int i) {
		balance += i;
		System.out.println(getAccountNo()+ " 계좌에 " + i +"만원이 입금되었습니다.");
	}

	public void deposit(int i) {
		balance -= i;
		System.out.println(getAccountNo()+ " 계좌에 " + i +"만원이 출금되었습니다.");
		
	}
}
