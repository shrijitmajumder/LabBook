/* Exercise 4: Write a Java program that prompts the user for an integer 
 * and then prints out all the prime numbers up to that Integer?
 */

package lab1;

import java.util.Scanner;

public class PrimeNumber {
	
	// function to determine whether a number is prime or not
	public static boolean fnisPrime(int n) {
		int flag=0;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0)
			return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter an Integer : ");
		int num=sc.nextInt(); // input for num
		System.out.print("The prime nos from 1 to "+num+" are : ");
		for(int i=1;i<=num;i++) {
			if(fnisPrime(i))
				System.out.print(i+" ");
		}
		
		sc.close();
	}

}
