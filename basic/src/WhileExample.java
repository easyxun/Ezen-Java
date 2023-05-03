import java.util.Iterator;
import java.util.zip.ZipEntry;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/*
 * 반복문 while
 */
public class WhileExample {

	public static void main(String[] args) {
		
//		기본
		int index = 0;
		
		while (index<100) {
			System.out.println("현정환 병1신");
			index++;
		}
		
//		예제1
		int x = 1, y = 0;
		while(x<=100){
			y += x++;
		}
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		System.out.println(y);
		
//		예제2
		int a = 1, b = 0, c = 0;
		while(a<=100){
			if(a%2 == 0) {
				b += a;
			} else {
				c += a;
			}
			a++;
		}
		System.out.println(1+2+3+4+5+6+7+8+9+10);
		System.out.println(y);
		System.out.println("짝수의 합:"+b);
		System.out.println("홀수의 합:"+c);
		
	}
	
}
