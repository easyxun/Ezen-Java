package ezen.oop.ams;
// 은행계좌 추상화
public class Account {
//   인스턴스변수
   private String accountNum;
   private String accountOwner;
   private int passwd;
   private long restMoney;
//   스태틱변수(클래스변수) 공유 되는 변수
   public final static String BANK_NAME="이젠은행"; //final 상수
//   private static int accountId = 1000;
   private static int accountId;
   
//   초기화 블록
//   주로 애플리케이션 환경설정파일의 내용을 읽어오는 코드
   static{   //static 선언시 처음에 한번만 초기화
//      static 없으면 인스턴스 생성시마다 초기화
      accountId=1000;
//      System.out.println("초기화블록 실행");
   }
   
   public Account() {}
   
   public Account(String accountOwner, 
         int passwd, long restMoney) {
//      System.out.println("생성자 실행");
      this.accountNum = (accountId++)+"";
      this.accountOwner = accountOwner;
      this.passwd = passwd;
      this.restMoney = restMoney;
   }

   public String getAccountNum() {
      return accountNum;
   }
   public void setAccountNum(String accountNum) {
      this.accountNum = accountNum;
   }
   public String getAccountOwner() {
      return accountOwner;
   }
   public void setAccountOwner(String accountOwner) {
      this.accountOwner = accountOwner;
   }
   public int getPasswd() {
      return passwd;
   }
   public void setPasswd(int passwd) {
      this.passwd = passwd;
   }
   public long getRestMoney() {
      return restMoney;
   }
   public void setRestMoney(long restMoney) {
      this.restMoney = restMoney;
   }
//   입금
   public long deposit(long money) {
      return restMoney += money;
   }
//   출금
   public long withdraw(long money) {
      return restMoney -= money;
   }
   
   public boolean checkPasswd(int pwd) {
       return passwd == pwd;
   }
   
   public static int getAccountId(){
      return accountId;
   }
   
   public void printAll() {
	   System.out.println("계좌번호\t예금주명\t****\t잔액");
	   System.out.println(accountNum+"\t"+accountOwner+"\t"+"****"+"\t"+restMoney);
   }
   
}