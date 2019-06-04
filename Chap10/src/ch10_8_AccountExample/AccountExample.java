package ch10_8_AccountExample;

import ch10_7_AccountException.Account;
import ch10_7_AccountException.BalanceInsufficientException;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		System.out.println("¿¹±Ý¾× : " +account.getBalance());
		
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
