import java.util.Scanner;

/*
 * 조건 (분기)문 if
 */
public class IfExample {

	public static void main(String[] args) {
		
//		if ~ else 문
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 :");
		int sc = scanner.nextInt(); 
		if (sc >= 90) {
			System.out.println("수");
		} else if (sc >= 80) {
			System.out.println("우");
		} else if (sc >= 60) {
			System.out.println("미");
		} else if (sc >= 50) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}

		
	}

}
