/*
 * 일상 생활의 강아지(객체)를 프로그램으로 표현한 클래스
 */
public class Dog {
//	인스턴스 변수 (메소드 안에서 실행되는 변수는 지역변수)
	String name;
	String type;
	int age;
	
//	인스턴스 메소드
	void bark() {
		System.out.println(name +"강아지가 왈왈 짖습니다.");
	}
	
	void eat() {
		System.out.println(name + "강아지가 먹이를 먹습니다.");
//		매개변수 ??
	}
	
	
}
