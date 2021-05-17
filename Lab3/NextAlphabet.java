package lab3;

import java.util.Scanner;

public class NextAlphabet {
	
	// function to replace consonants of a String with the next alphabet
	public static String alterString(String s) {
		char c=' ';
		String w="";
		for(int i=0;i<s.length();i++) {
			c=s.charAt(i);
			if((c>=65 && c<=90) && (c!='A' && c!='E' && c!='I' && c!='O' && c!='U')) {
				c=(char)((int)c+1);
			}
			else if((c>=97 && c<=122) && (c!='a' && c!='e' && c!='i' && c!='o' && c!='u')) {
				c=(char)((int)c+1);
			}
			w+=c;
		}
		return w;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.print("Enter the String : ");
		String input = sc.nextLine(); // input for the string
		System.out.print("Altered String : "+alterString(input));
		
		sc.close();
	}

}
