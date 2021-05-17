package lab3;

import java.util.Scanner;

public class MirrorImage {
	
	// function to generate miiror image of a string
	public static String getImage(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
			rev+=s.charAt(i);
		
		return s+"|"+rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the String : ");
		String input = sc.nextLine(); // input for the string
		System.out.println("Output : "+getImage(input));
		
		sc.close();
	}

}
