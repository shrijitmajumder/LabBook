// Exercise 8: Create a method to check if a number is a power of two or not

package lab1;

import java.util.Scanner;

public class PowerOf2 {
	
	// function to check whether the number is power of 2 or not
		public static boolean checkNumber(int n) {
			return (int)(Math.ceil((Math.log(n) / Math.log(2)))) 
		            == (int)(Math.floor(((Math.log(n) / Math.log(2)))));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the number : ");
		int num=sc.nextInt(); // input for num
		if(checkNumber(num))
			System.out.println(num+" is a power of two");
		else
			System.out.println(num+" is not a power of two");

		sc.close();
	}

}
