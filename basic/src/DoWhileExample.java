import java.util.Iterator;

import javax.security.auth.x500.X500Principal;
import javax.sql.rowset.JoinRowSet;

/*
 * do ~ while 문
 */
public class DoWhileExample {

	public static void main(String[] args) {
		
//		do{실행} ~ while(조건)문 : 먼저 실행 후 조건 확인
		int fight = 0;
		do {
			System.out.println("화이팅");
			fight++;
		} while (fight<10);
		
	}

}
