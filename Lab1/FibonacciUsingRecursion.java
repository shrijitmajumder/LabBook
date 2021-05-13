/* Exercise 3: The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses recursive function to print the nth value of the Fibonacci sequence?
 */
package lab1;

import java.util.Scanner;

public class FibonacciUsingRecursion {
	
	// recursive function for computing Fibonacci term
	public static int fibonacci(int n) {
		if(n==1 || n==2)
			return 1;
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the no. of terms : ");
		int num=sc.nextInt(); // input for num
		if(num%10==1)
			System.out.print("The "+num+"st value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%10==2)
			System.out.print("The "+num+"nd value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%10==3)
			System.out.print("The "+num+"rd value of the Fibonacci sequence is "+fibonacci(num));
		else if(num%100==11 || num%100==12 || num%100==13)
			System.out.print("The "+num+"th value of the Fibonacci sequence is "+fibonacci(num));
		else
			System.out.print("The "+num+"th value of the Fibonacci sequence is "+fibonacci(num));
		
		sc.close();
	}

}
