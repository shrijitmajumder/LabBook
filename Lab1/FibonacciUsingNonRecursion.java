/* Exercise 3: The Fibonacci sequence is defined by the following rule. 
 * The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. 
 * Write a Java program that uses non-recursive function to print the nth value of the Fibonacci sequence?
 */
package lab1;

import java.util.Scanner;

public class FibonacciUsingNonRecursion {
	
	// non-recursive function for computing Fibonacci term
	public static int fibonacci(int num) {
		int f1=0,f2=1,f3=0;
		
		// for computing each term of the Fibonacci series
		for(int i=1;i<=num;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
		}
		
		return f1;
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
