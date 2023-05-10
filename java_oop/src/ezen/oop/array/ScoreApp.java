package ezen.oop.array;

public class ScoreApp {

	public static void main(String[] args) {

//		Student std = new Student(1,"현정환",10);
//		std.printAll();
		
		Score[] std;
		std = new Score[26];
		std[0] = new Score(1, "이지선", 99);
		//--
		std[25] = new Score(2, "현정환", 10);

		for(int i=0;i<std.length;i++) {
			if(std[i] != null) {
				std[i].printAll();
				}
			
		}
	}

}
