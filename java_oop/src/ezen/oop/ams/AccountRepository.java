package ezen.oop.ams;

import java.util.Scanner;

/**
 * @param list	은행계좌 목록
 * @author	Lee Jiseon
 * @author	Hyun Junghwan
 * @see		ezen.oop.array
 * @since 	1.0
 */
public class AccountRepository {
	
	private Account[] accounts;
	private int count;
	
	public AccountRepository() {
		this(100);
		}
	
	public AccountRepository(int capacity) {
		this.accounts = new Account[capacity];
		}
	
	public int getCount() {
		return count;
		}
	
	
	
	/**
	 * @return 전체계좌목록
	 * 
	 */ 
	public Account[] getAccounts() {
		return accounts;
		}
	
	
	
	/**
	 * 
	 * 신규계좌 등록
	 * @param account
	 * @return 등록여부
	 */ 
	public boolean addAccount(Account account) {
		accounts[count++] = account;
		return true;
		}
	
	
	
	/**
	 * 
	 * @param accountNum 검색 계좌번호
	 * @return 검색된계좌
	 */
	public Account searchAccount(String accountNum) {
			if(("0211".equals(accountNum)){
				
				return getPasswd();
				
			}else {
				return null;
			}
	}
	
	
	
	
	
	private Account getPasswd() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param accountNum 검색 예금주명
	 * @return 검색된계좌목록
	 */
	public Account[] searchAccountByOwner(String accountOwner) {
		
		return null;
		
	}
	
	/**
	 * 
	 * @param accountNum 검색 예금주명
	 * @return 검색된계좌목록
	 */
	public boolean removeAccount(String accountNum) {
		
		return false;
		
	}
}