// Exercise 1: Create a method to find the sum of the cubes of the digits of an n digit number

package lab1;

import java.util.Scanner;
public class SumOfCubeOfDigits {
	
	// function to count digits of a number
	public static int countdigit(int n)
	{
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		return count;
	}
	
	// function to reverse a number
	public static int reversenum(int n)
	{
		int reverse=0;
		while(n>0) {
			reverse=reverse*10+n%10;
			n/=10;
		}
		return reverse;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter a number : ");
		int num=sc.nextInt(); // input for num
		int sum=0;
		int temp=reversenum(num);
		int count=countdigit(num);
		System.out.print("The sum of cube of digits of "+num+" = ");
		while(num>0) {
			sum+=(int)Math.pow(num%10,3);
			num/=10;
		}
		while(countdigit(temp)>0) {
			if(countdigit(temp)>1)
				System.out.print(temp%10+"^3 + ");
			else
				System.out.print(temp%10+"^3 = ");
			temp/=10;
		}
		System.out.print(sum);
		sc.close();
	}

}
