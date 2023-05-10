package ezen.oop.ams;

public class AMS {

	public static void main(String[] args) {
		System.out.println("***************************************************");
		System.out.println("**********"+Account.BANK_NAME+" 계좌 관리 애플리케이션**********");
		System.out.println("***************************************************");
		
//		신규계좌등록테스트
		AccountRepository repository = new AccountRepository();
		Account account = new Account("현정환",0001,1000000);
		repository.addAccount(account);
//		boolean success =  repository.addAccount(account);
//		if(success) {
//			System.out.println("계좌 정상 등록");
//		} else {
//			System.out.println("계좌 등록 실패");
//		}
		repository.addAccount(new Account("현정환",0002,1000000));
		repository.addAccount(new Account("이지선",0003,1000000));
		repository.addAccount(new Account("김성진",0004,1000000));
		
//		전체계좌조회
		System.out.println("****************전체 계좌 목록****************");
		Account[] list = repository.getAccounts();
		for(int i = 0; i <repository.getCount();i++) {
			list[i].printAll();
		}
		
//		계좌번호로 검색테스트
		System.out.println("**********계좌번호로 검색된 계좌 목록**********");
		String accountNum = "1002"; // 사용자로 부터 입력받은 계좌번호
		
		Account searchAccount =  repository.searchAccount(accountNum);
		if(searchAccount != null) {
			searchAccount.printAll();
		}else {
			System.out.println("해당 계좌번호가 존재하지 않습니다");
		}
		
//		예금주명으로 검색테스트
		System.out.println("*********예금주명으로 검색된 계좌 목록*********");
		String accountOwner = "현정환"; // 사용자로 부터 입력받은 계좌번호
		
		Account[] searchList =  repository.searchAccountByOwner(accountNum);
		if(searchList != null) {
			for (int i = 0; i < searchList.length; i++) {
				searchList[i].printAll();
			}
		}else {
			System.out.println("해당 예금주가 존재하지 않습니다");
			}
//		계좌번호 삭제 테스트
		System.out.println("********계좌번호 삭제 결과*********");
		boolean ok = repository.removeAccount(accountNum)
		
		
		System.out.println("*******계좌관리 어플리케이션을 종료합니다*******");
		
	}
	

}
