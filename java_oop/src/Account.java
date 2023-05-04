import java.net.PasswordAuthentication;

/* 은행 계좌(객체)
 * 
 * (데이터)
 * -계좌번호-accountNum:String
 * -예금주-accountOwner:String
 * -비밀번호-passwd:int
 * -잔고-restMoney:long
 * 
 * (기능)
 * +입금하기+deposit (money:long):long
 * +출금하기+withdraw(money:long):long
 * +잔액 조회하기+getRestMoney():long
 * +비밀번호 확인하기+checkPasswd(passwd:int):boolean
 */ 

public class Account {
	
//	인스턴스변수
	String accountNum;
	String accoutOwner;
	int passwd;
	long restMoney;
	boolean pwd;
	
	int pass = 0211;
	
//	인스턴스 메서드
	long deposit(long money) {
		return restMoney += money;
	}
	
	long withdraw (long money) {
		return restMoney -= money;
	}
	
	long getRestMoney() {
		return restMoney;
	}
	
	boolean cheakPasswd(int passwd) {
	
		if(pass == passwd) {
			return true ;
			} else {
				return false ;
			}
		}
	}
