/* Exercise 2: Write a java program that simulates a traffic light. 
 * The program lets the user select one of three lights: red, yellow, or green with radio buttons. 
 * On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .Initially there is no message shown.
 */

package lab1;

import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); // object creation of Scanner class
		System.out.println("R - Red\nY - Yellow\nG - Green");
		System.out.print("Enter your choice : ");
		char choice = sc.next().charAt(0); // input for choice
		switch(choice)
		{
			case 'r':
			case 'R':
				System.out.println("stop");
				break;
			case 'y':
			case 'Y':
				System.out.println("ready");
				break;
			case 'g':
			case 'G':
				System.out.println("go");
				break;
			default :
				System.out.println("Enter correct choice (R/Y/G)...");
		}
		
		sc.close();
	}

}
