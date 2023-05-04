/*
 * private class PrivateExample { //클래스 안에서만 접근 가능
 * }
 */

public class PrivateExample{
	
	//접근 불가
	
	private String name = "이지선";
	
	//접근 가능
	int namelength() {
		int namelength = 3;
		return namelength;
	}
}