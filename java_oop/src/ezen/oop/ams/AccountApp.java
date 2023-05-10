package ezen.oop.ams;
/*
 * 1차원 배열을 이용한 계좌 목록 관리
 */
public class AccountApp {

	public static void main(String[] args) {
		Account[] accounts = new Account[100];
		
		int index = 0;
		
//		새로운 계좌 등록(개설)
		System.out.println("---전체계좌 검색결과---");
		Account account = new Account("이지선",0211,1000000);
		accounts[index++] = account;
		
		Account account2 = new Account("현정환",4444,10);
		accounts[index++] = account2;
		
		Account account3 = new Account("윤수빈",1234,1000000);
		accounts[index++] = account3;
		
//		전체계좌목록조회
		for(int i = 0; i<index; i++) {
			accounts[i].printAll();
		}
//		계좌번호로 검색
		System.out.println();
		System.out.println("---계좌번호 검색결과---");
	      String searchName = "1001";
	      for (int i = 0; i < index; i++) {
	         if(accounts[i].getAccountNum().equals(searchName)) {
	            accounts[i].printAll();
	         }
	      }
	    System.out.println();
	    System.out.println("---String 비교 / String char 형변환---");
	    
//		String 비교는 str1 == str2 로 하면 주소값이 비교되기 때문에 str1.equals(str2), equalsIgnoreCase() 등으로 비교해야 한다
//		char을 String으로 형변환하기
		char[] ch = {'j','a','v','a'};
		String str = new String(ch);
		System.out.println(str);
		
	}}