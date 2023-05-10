package ezen.oop.array;

public class Score2App {

	public static void main(String[] args) {
		

		Score[] std = new Score[] {
				new Score(1, "이지선", 90),
				new Score(2, "현정환", 10), 
				new Score(3, "장원종", 91), 
				new Score(4, "윤수빈", 95)
				};
		System.out.println("=========================");
		System.out.println("번호\t이름\t점수");
		System.out.println("=========================");
		
		double total = 0, avg = 0;
		
		for(int i=0;i<std.length;i++) {
			
			if(std[i] != null) {
				std[i].printAll();
				total += std[i].getScore();
				}
			}
		avg = total / std.length;
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		


	}


}
