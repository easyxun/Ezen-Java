import java.util.Scanner;

/*
 * switch ~ case 문
 */
public class SwitchExample {

	public static void main(String[] args) {

//		switch(조건) ~ {case : 실행} 문
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("1에서 5사이의 수를 입력하세요 :");
		int sc = scanner.nextInt();

		switch (sc) {
			case 1:
				System.out.println("1입니다.");
				break;
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 4:
				System.out.println("4입니다.");
				break;
			case 5:
				System.out.println("5입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
//				break; 써도 되는데 마지막 생략이 원칙
		}
		
		
		
//		switch ~ case 문 break가 없을 경우
//		break; 는 이동문 (중괄호 밖으로 이동)
		
		System.out.println("1에서 5사이의 수를 입력하세요 :");
		int sc2 = scanner.nextInt();
		
		switch (sc2) {
		case 1: System.out.println("1입니다.");
		case 2: System.out.println("2입니다.");
		case 3: System.out.println("3입니다.");
		case 4: System.out.println("4입니다.");
		case 5: System.out.println("5입니다.");
		default: System.out.println("잘못된 입력입니다.");
		}
		
		
		
//		switch 변수타입 (정수, 문자, 문자열 사용 가능)
//		                (실수 사용 불가능)
	
		char sc3 = 'a';
		switch (sc3) {
		case 'a': System.out.println("a입니다."); break;
		case 'b': System.out.println("b입니다."); break;
		case 'c': System.out.println("c입니다."); break;
		case 'd': System.out.println("d입니다."); break;
		case 'e': System.out.println("e입니다."); break;
		default: System.out.println("잘못된 입력입니다.");
		}
		
		
		
//		미니문제
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("수 ~ 가 를 입력하세요 :");
		String sc4 = scanner4.nextLine();
		
		switch (sc4) {
			case "수":
				System.out.println("90점 이상 입니다.");
				break;
			case "우":
				System.out.println("80점 이상 입니다.");
				break;
			case "미":
				System.out.println("70점 이상 입니다.");
				break;
			case "양":
				System.out.println("60점 이상 입니다.");
				break;
			case "가":
				System.out.println("50점 이상 입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
//				break; 써도 되는데 마지막 생략이 원칙
		}
		
		
		
//		미니문제2
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("점수를 입력하세요 :");
		int sc5 = scanner5.nextInt();

		switch (sc5/10) {
			case 10:
				System.out.println("수입니다.");
				break;
			case 9:
				System.out.println("수입니다.");
				break;
			case 8:
				System.out.println("우입니다.");
				break;
			case 7:
				System.out.println("미입니다.");
				break;
			case 6:
				System.out.println("양입니다.");
				break;
			case 5:
				System.out.println("가입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
//				break; 써도 되는데 마지막 생략이 원칙
		}
		
	}

}
