/* Exercise 1: Write a Java program that reads a line of integers and then displays 
* each integer and the sum of all integers. (Use String Tokenizer class)? */

package lab3;

import java.util.Scanner;

public class StringTokenizerSumOfIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the line of integers : ");
		String input = sc.nextLine(); // input for line of integers
		String nums[]=input.split(" ");
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=Integer.parseInt(nums[i]);
			if(i<nums.length-1)
				System.out.print(nums[i]+" + ");
			else
				System.out.print(nums[i]+" = ");
		}
		System.out.print(sum);
		sc.close();
	}

}
