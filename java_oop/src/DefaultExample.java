
class DefaultExample {//같은 패키지 내에서는 접근 가능
	
	private int acc = 0211; // 같은 패키지 내에서도 접근 불가
	//필드 내 인스턴스 변수 드래그 후 alt shift s > getter setter 시 메소드 자동 생성

	/**
	 * @return the acc
	 */
	public int getAcc() {
		return acc;
	}

	/**
	 * @param acc the acc to set
	 */
	public void setAcc(int acc) {
		this.acc = acc;
	}
	

}
