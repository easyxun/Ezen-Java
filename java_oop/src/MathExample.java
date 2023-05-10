import javax.swing.JInternalFrame;

public class MathExample {

	public static void main(String[] args) {
		double radian = 50.6;
//		double result = 2 * 3.141592 * 3.141592;
		double area = 2 * Math.PI * Math.PI;
		System.out.println("원의 면적 : "+ area);
		System.out.println(Math.PI);
		
	}
	

}
/*
* 메소드(static) : static 변수 : static변수나 메소드는 메소드영역에 저장되기 때문에 인스턴스 변수 없이 사용 가능(정적 메소드는 클래스명으로 사용 권장)
* 힙 : 인스턴스변수 (객체 가르킴(주소))
* 스택 : 객체
* 
private static int accountID = 10000;
public int getAccountId()


public static class private static int accountID(){
return accountId;
}


 */