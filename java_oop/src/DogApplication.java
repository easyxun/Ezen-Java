public class DogApplication {

	public static void main(String[] args) {
		
//		메인 메서드 위치 상 지역변수, 기본 데이터 타입
		int age = 50;
		
//		메모리 상에 Dog 인스턴스 가르킴(생성)
//		위치 상 지역변수 > 레퍼런스 변수
		Dog dog;
		
//		메모리에 새로운 Dog 클래스를 만들어라 메소드호출
		dog = new Dog();
		
//		인스턴스의 속성(상태) 변경 [.연산자는 '~의' 로 해석]
		dog.name = "누누";
		dog.type = "비숑";
		dog.age = 8;
		
		dog.bark();
		dog.eat();
		
//		객체 재사용
		Dog dog2;
		dog2 = new Dog();
		dog2.name = "복돌이";
		dog2.type = "믹스";
		dog2.age = 16;
		
		dog2.bark();
		dog2.eat();
		
		
		
	}

}
