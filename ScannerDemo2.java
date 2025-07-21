/*Name: Joshua Dilley
Date: 07/21/2025
Source Code: ScannerDemo2:
Action: This is a short demo for how to use the Scanner class from Absolute Java
6th Edition. It also demos a few of the methods that are used with the class. 
 */
package absolutejava;

import java.util.Scanner;

public class ScannerDemo2
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int n1, n2;
        String Word1, Word2, Junk, Line;
        double d1, d2;
        
        System.out.println("Enter two whole numbers ");
        System.out.println("separated by one or more spaces: ");
        
        n1 = Input.nextInt();
        n2 = Input.nextInt();
        System.out.println("You entered " + n1 + " and " + n2);
        
        System.out.println("Next enter two decimal numbers: ");
        d1 = Input.nextDouble();
        d2 = Input.nextDouble();
        System.out.println("You entered " + d1 + " and " + d2);
        
        System.out.println("Please enter two words separated by a white space: ");
        Word1 = Input.next();
        Word2 = Input.next();
        System.out.println("You entered \"" + Word1 + "\" and \"" + Word2 + "\"");
        
        Junk = Input.nextLine();
        
        System.out.println("Next, enter a line of text: ");
        Line = Input.nextLine();
        System.out.println("You entered: \"" + Line + "\"");
    }
}
/* ******************************Program Output********************************
Enter two whole numbers 
separated by one or more spaces: 
8 6
You entered 8 and 6
Next enter two decimal numbers: 
6.23 5.2
You entered 6.23 and 5.2
Please enter two words separated by a white space: 
Computer Science
You entered "Computer" and "Science"
Next, enter a line of text: 
Ok, here is a line of text.
You entered: "Ok, here is a line of text."
*/