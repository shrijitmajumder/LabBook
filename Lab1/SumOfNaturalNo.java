/* Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers 
 * which are divisible by 3 or 5.
 */
package lab1;

import java.util.Scanner;

public class SumOfNaturalNo {
	
	// function to calculate sum of first n natural numbers which are divisible by 3 or 5
	public static int calculateSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%3==0 || i%5==0) // checking if i is divisible by 3 or 5
				sum+=i;
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the number of terms : ");
		int num=sc.nextInt(); // input for num
		
		System.out.print("The sum of first "+num+" natural numbers which are divisible by 3 or 5 is "+calculateSum(num));
		sc.close();
	}

}
