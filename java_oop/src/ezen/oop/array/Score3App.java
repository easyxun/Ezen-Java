package ezen.oop.array;

public class Score3App {

	public static void main(String[] args) {
		

		Score[][] std = {
				{
					new Score(1, "이지선", 90),
					new Score(2, "현정환", 10), 
					new Score(3, "장원종", 91), 
					new Score(4, "윤수빈", 95)
				},
				{
					new Score(1, "이지선", 90),
					new Score(2, "현정환", 10), 
					new Score(3, "장원종", 91), 
					new Score(4, "윤수빈", 95)
				},
				{
					new Score(1, "이지선", 90),
					new Score(2, "현정환", 10), 
					new Score(3, "장원종", 91), 
					new Score(4, "윤수빈", 95)
				}
		};
//		alt+shift+R 선택 전체변경
		
//			반목록
		for(int i=0; i<std.length; i++) {
	         System.out.println((i+1)+"반성적목록\t"+std[i].length+"명");
	         double total = 0;
//	         학생목록
	         System.out.println("=========================");
	         System.out.println("번호\t이름\t점수");
	         System.out.println("=========================");
	         for(int j=0; j<std[i].length; j++) {
	        	 std[i][j].printAll();
	        	 total += std[i][j].getScore();
	         }
	         double avg = total / std[i].length;
	         System.out.println();
	         System.out.println("총점 : "+ total);
	         System.out.println("평균 : "+ avg);
	         System.out.println();
	         System.out.println();
	         }
		}
}
