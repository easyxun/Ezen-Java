package ezen.oop.array;

public class Score {
//	번호 이름 성적
	static final String SCHOOL_NAME = "이젠 초등학교";
	
	private int no;
	private String name;
	private int score;
	
	public Score() {}
	public Score(int no, String name, int score) {
		this.no = no;
		this.name = name;
		this.score = score;
	}

	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void printAll() {
		System.out.println(no+"\t"+name+"\t"+score);
	}
	
	
	
	
}
