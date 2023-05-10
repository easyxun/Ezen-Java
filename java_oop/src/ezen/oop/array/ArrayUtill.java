package ezen.oop.array;

public class ArrayUtill {
	   

//	   오름차순, 내림차순을 구분하기 (상수)
	   public static final int ASC = 0;
	   public static final int DES = 1;
	   
	   
//	   배열 정렬 기능(오름차순, 내림차순 모두 지원)
	   public static void sort(int[] num, int sortBy) {
		   for(int i=0;i<num.length-1;i++) {
			   for(int j=i+1;j<num.length;j++) {
					if(sortBy == 0) {
						if(num[i]<num[j]) {
							int temp = num[i];
							num[i] = num[j];
							num[j] = temp;
							}
					} else if(num[j]<num[i]) {
								int temp = num[j];
								num[j] = num[i];
								num[i] = temp;
								}
					}
			   }
		   }
	   }