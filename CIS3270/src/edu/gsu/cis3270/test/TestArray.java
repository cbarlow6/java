package edu.gsu.cis3270.test;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				int [][] twoD = new int[3][2];
				
				for(int[] inner: twoD){
					for(int num: inner)
						System.out.print(num + " ");
				//for(int i =0; i < twoD.length; i ++){
					//for(int j = 0; j < twoD[i].length; j++)
						//System.out.print(twoD[i][j] + " ");
				System.out.println();
				}		
	}

}
