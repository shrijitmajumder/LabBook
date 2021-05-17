/* Exercise 4: Create a method that accepts a number and 
 * modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is. 
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2 */
 

package lab3;

import java.util.Scanner;

public class ModifyNumber {
	
	// function to return the number after performing subtraction between consecutive digits
	public static int modifyNumber(int number) {
		String num=""+number;
		String result="";
		for(int i=0;i<num.length()-1;i++) {
			result+=Math.abs(((int)num.charAt(i)-48)-((int)num.charAt(i+1)-48));
		}
		result+=number%10;
		return Integer.parseInt(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the number : ");
		int num = sc.nextInt(); // input for integer
		
		System.out.println("Output : "+modifyNumber(num));
		sc.close();
	}

}
