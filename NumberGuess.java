package com.dharani.numberguess;
import java.util.*;
import javax.swing.*;
import java.util.Random;
public class NumberGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int trail=0;
		int number=r.nextInt(100)+1;
		int usernumber;
		boolean flag=false;
		while(flag==false) {
			String num = JOptionPane.showInputDialog(null, "Enter the number between 1 to 100", "Number Guessing Game", JOptionPane.INFORMATION_MESSAGE);
			usernumber = Integer.parseInt(num);
			trail++; //first trail of user.
			
			//check for equality of computer and user guess
			if(usernumber==number) {
				flag=true;
			}
			//if the user guess is less than the computer number
			else if(usernumber<number)
				JOptionPane.showMessageDialog(null, "Oops!! Your guess is too small. You may give larger number!!", "Number Guessing Game",  JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("Your guess is low");
			//if the user guess is more than the computer number
			else
				JOptionPane.showMessageDialog(null, "Oops!! Your guess is too high. You may give Smaller number!!", "Number Guessing Game",  JOptionPane.INFORMATION_MESSAGE);
				//System.out.println("Your guess is high");
		}
		JOptionPane.showMessageDialog(null, "Your guess is right in "+trail+"trails", "Number Guessing Game",  JOptionPane.INFORMATION_MESSAGE);
		System.out.println("Hurray!! You won.......");
		System.out.println("Thankyou!! Come again");
		sc.close();
	}
}
