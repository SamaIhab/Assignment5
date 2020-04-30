package assignment5;

import java.util.Random;


public class mainProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int mat1[][]=new int[2][2];
		int mat2[][]=new int[2][2];
		int sum[][]=new int[2][2];
		Random random=new Random();
		
		//initialize matrix 1 with random value
		System.out.println("Matrix 1: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				mat1[i][j]=random.nextInt(10);
				System.out.print(mat1[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//initialize matrix 2 with random value
		System.out.println("Matrix 2: ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				mat2[i][j]=random.nextInt(10);
				System.out.print(mat2[i][j]+" ");
				
			}
			System.out.println();
		}
		
		//sum of 2 matrices
		System.out.println("Sum : ");
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				sum[i][j]= mat1[i][j]+mat2[i][j];
				System.out.print(sum[i][j]+" ");
				
			}
			
			System.out.println();
		}

		

	}

}
