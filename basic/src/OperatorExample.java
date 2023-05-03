/*
 * 자바에서 지원하는 연산자들
 */

public class OperatorExample {

	public static void main(String[] args) {
		int x = 30, y = 5;
		
		
		
//		산술 연산자 (+, -, *, /, %)
		System.out.println("산술 연산자");
		System.out.println(x + y); // 30 + 5
		System.out.println(x - y); // 30 - 5
		System.out.println(x * y); // 30 * 5
		System.out.println(x / y); // 30 / 5
		System.out.println(x % y); // 30 % 5
		
		
		
//		(+) 연산자는 연산자 오버로딩을 지원한다
		System.out.println("연산자 오버로딩");
		System.out.println("김" + "기정");
		System.out.println("김" + 30); // 김30
		System.out.println(30 + "김"); // 30김
		System.out.println("김" + 30 + 10); // 김3010
		System.out.println("김" + (30 + 10)); // 김40
		System.out.println(30 + 10 + "김"); // 40김
		
		
		
//		복합 대입 연산자 (+=, -=, *=, /=, %=)
		System.out.println("복합 대입 연산자");
		System.out.println(x += 10); // x = x+10
		System.out.println(x -= 10); // x = x-10
		System.out.println(x *= 10); // x = x*10
		System.out.println(x /= 10); // x = x/10
		System.out.println(x %= 10); // x = x%10
		
		
		
//		비교 연산자 (<, >, <=, >=, ==, !=)
		System.out.println("비교 연산자");
		int a = 10, b = 10;
		System.out.println(a==b); //x는 y와 같다 (true)
		System.out.println(a=b); //y값을 x에 대입
		System.out.println(a != b); // x는 y와 같지않다 (false)

		
		
//		증감 연산자 (++, --)
		System.out.println("증감 연산자");
		x = 10;
		System.out.println(x++); // 10+1
		System.out.println(x--); // 10-1
		System.out.println(++x); // +1 +10
		System.out.println(--x); // -1 +10
		
		
		
//		증감 연산자 심화 (++, --)															복습 필요
		System.out.println("증감 연산자 심화");
		int result = 0;
		int z = 10; y = 10;
		result = ++z; // 11*
		System.out.println(result);
		System.out.println(x);
		result = y++; // 10*
		System.out.println(result);
		System.out.println(y);
		
		
		
//		논리 연산자 (&&, ||)
		System.out.println("논리 연산자");
		
		x=30;
		y=50;
		System.out.println(x==30 && y==50); // true
		System.out.println(x!=30 && y==50); // false*										복습 필요
		System.out.println(x!=30 || y==50); // true*
		System.out.println(!true); // false
		
		
		
//		비트연산자
//		스킵
		
		
		
//		조건 삼항 연산자 : 미니 if문 (? :)
		System.out.println("조건 삼항 연산자");
		
		String str = 85 == 60 ? "통과" : "실패";
		System.out.println(str);
		
		String str2 = 85 == 85 ? "통과" : "실패";
		System.out.println(str2);
		
		
		
//		자동 형변환(Promotion = Up Casting)
		System.out.println("자동 형변환");
		
		double some1 = 50;
		System.out.println(some1);
		
		int k = 10;
		System.out.println("김"+k); // 자동형변환 문자형
		
		
		
//		강제 형변환(Demotion = Down Casting)
		System.out.println("강제 형변환");
		
		double avg = 85.34567;
		System.out.println(avg);
		System.out.println((int)avg);
		
		int avg2 = 111111;
		System.out.println(avg2);
		System.out.println((short)avg2); // short 범위를 넘어가서 다시시작					복습 필요
		
//		정환이 천재네
		
		
		
		
	}	

}
