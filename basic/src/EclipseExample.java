
public class EclipseExample {

	public static void main(String[] args) {
		
//		컴파일 연습
		String messege = "이클립스 연습입니다.";
		int age = 40;
		double weight = 68.5;
		System.out.println(messege+"\n"+age+"\n"+weight);
		System.out.println("컴파일 연습");
		
//		이스케이스 문자처리 \\, \', \", \(, \) 등
		String mes = "\'자바는 웹애플리케이션 개발 최강 언어입니다.\'";
		System.out.println(mes);
		
//		제어문자 \n, \b 등
		String mes2 = "안녕하세요.\n김기정입니다\b."; // (\b)백스페이스
		System.out.println(mes2);
		
//		boolean true false
		boolean mes3 = false;
		System.out.println(mes3); // false
		
//		boolean mes4 = 0;
//		boolean에서 정수로 형변환 안됨
		
	
	}

}
