import java.util.Scanner;

public class AccountApplication {

	public static void main(String[] args) {
		
		Account bank = new Account();
//		1. Account bank; : 4바이트 할당
//		2. bank = new Account(); 메모리 상 인스턴스 할당
		
		//데이터 할당
		bank.accountNum = "12345";
		bank.accoutOwner = "이지선";
		bank.passwd = 0211;
		bank.restMoney = 1000000;
		//기능 호출
		long money = bank.getRestMoney();
		System.out.println("현재 잔액: "+money);
		
		long restMoney = bank.deposit(100000000);
		System.out.println("입금 후 잔액: "+restMoney);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호 입력: ");
		
		int strpw = sc.nextInt();
		boolean b = bank.cheakPasswd(strpw);
		System.out.println(b);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * Default 클래스 내의 private 접근
		 */
//		DefaultExample 패키지 필드내의 private 변수 참조 불가
		DefaultExample sec = new DefaultExample();
//		sec.acc;
		
		
		
		/*
		 * Public 클래스 내의 private 접근
		 */
//		PrivateExample 패키지 필드내의 private 변수 참조 불가
//		namelength() 메소드는 참조 가능
		PrivateExample sec2 = new PrivateExample();
//		sec2.name;
		int a = sec2.namelength();
		System.out.println(a);

	}

}
