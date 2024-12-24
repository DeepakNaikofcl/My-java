package com.spec.deepak;
public class Demo {
	
	public static void main(String [] args) {
		
		int [] [] data = new int[2][3];
		
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		
		
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		
		
		for(int row = 0;row<2;row++) {
			for(int col =0;col<3;col++) {
				
				System.out.print(data[row][col]+" ");
			}
			
			System.out.println();
		}
		
	}
}
