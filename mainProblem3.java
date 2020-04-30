package assignment5;
import java.util.Scanner;

public class mainProblem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, diamond;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("How many rows you want in your pyramid?");
		size=sc.nextInt();
		diamond=size+(size-1);
		
		
		System.out.println("Here is your diamond ");
		for(int i=0; i<size;i++ ) {
			for(int j=0; j<size-1-i; j++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		
		for(int i =size-1; i>=1;i--) {
			int sp=size-i;
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		sc.close();

	}
	

}



