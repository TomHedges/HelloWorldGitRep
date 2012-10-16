
/*************************************************************************
 *  Compilation:  javac HelloWorld.java *
 *  Execution:    java HelloWorld *
 *  
 *  Prints "Hello, World". By tradition, this is everyone's first program. *
 *  % java HelloWorld *  Hello, World *
 *  
 *  These 17 lines of text are comments. They are not part of the program;
 *  they serve to remind us about its properties. The first two lines tell
 *  us what to type to compile and test the program. The next line describes
 *  the purpose of the program. The next few lines give a sample execution
 *  of the program and the resulting output.
 *************************************************************************/

package HelloWorld;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloWorld extends JFrame {
	HelloWorld(String title) {
		this.setSize(500,500);
		setTitle(title);
	}

	public void paint(Graphics g) {
		super.paint(g);     
		g.drawString("Test some text printing - Tom Hedges",100,100);
		g.drawRoundRect(200, 200, 75, 75, 10, 10);
	}

	public static void main(String[] args) {
		System.out.print("Please enter your name: ");
		Scanner in = new Scanner(System.in);
		String userName = in.next();
		HelloWorld window = new HelloWorld("Hello, "+userName+"!"); 
		window.setVisible(true); 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

		System.out.println("Hello, World");
		System.out.print("Please enter amount due (in pence): ");
		int amountDue = in.nextInt();
		System.out.print("Please enter amount paid (in pence): ");
		int amountReceived = in.nextInt();
		int amountChangeByDenom = (amountReceived - amountDue)/100;
		int amountChangeRemainder = (amountReceived - amountDue)%100;
		System.out.println("Change (£1 coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/50;
		amountChangeRemainder = amountChangeRemainder%50;
		System.out.println("Change (50p coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/20;
		amountChangeRemainder = amountChangeRemainder%20;
		System.out.println("Change (20p coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/10;
		amountChangeRemainder = amountChangeRemainder%10;
		System.out.println("Change (10p coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/5;
		amountChangeRemainder = amountChangeRemainder%5;
		System.out.println("Change (5p coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/2;
		amountChangeRemainder = amountChangeRemainder%2;
		System.out.println("Change (2p coins): " + amountChangeByDenom);
		amountChangeByDenom = amountChangeRemainder/1;
		amountChangeRemainder = amountChangeRemainder%1;
		System.out.println("Change (1p coins): " + amountChangeByDenom);
		System.out.println("Error check - Remainder (pence) - should be 0: " + (amountChangeRemainder));
	}
}