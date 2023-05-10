package ezen.oop.array;

public class ArrayApp {

	public static void main(String[] args) {
		int num[] = {8,7,6,5,4,3,2,1};
		

		/*
	      for (int i = 0; i <(num.length); i++) {
	          for (int j = 0; j < (num.length -1); j++) {
	             int temp = 0;
	             if(array[j] > array[j +1]) {
	                temp = array[j];
	                array[j] = array[j+1];
	                array[j+1] = temp;
	             }
	    */
		
		ArrayUtill.sort(num, ArrayUtill.ASC);
		
		for(int i = 0; i<num.length;i++){
			System.out.print(num[i]);
			
		}
		System.out.println();
		
		ArrayUtill.sort(num, ArrayUtill.DES);
		
		for(int j = 0; j<num.length;j++){
			System.out.print(num[j]);
			
		}
			
		}
		
	}


