/*Name: Joshua Dilley
Date: 07/27/2025
Source Code: BabylonianSquareRoot.java
Action: This is a problem program from Chapter Two of Absolute Java 6th Edition.
It calculates a number's square root using an initial guess. 
*/
package absolutejava;
import java.util.Scanner;
public class BabylonianSquareRoot 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double Number = 0, Guess = 0, r = 0, SqrRootOfNumber = 0;
        
        
        System.out.println("Which number's square root would you like to compute? ");
        System.out.println("Please enter a positive number: ");
        Number = Input.nextDouble();
        System.out.println("What is your best guess as to the number's square root? ");
        Guess = Input.nextDouble();
        
        for(int i = 0; i < 6; ++i)
        {
            r = Number/Guess;
            Guess = (Guess + r)/2;
        }    
        
        System.out.printf("The square root of " + Number + " is " + "%.2f", Guess);
        System.out.println("");
    }
}
/* **********************************Program Output****************************
Which number's square root would you like to compute? 
Please enter a positive number: 
25
What is your best guess as to the number's square root? 
11
The square root of 25.0 is 5.00

Which number's square root would you like to compute? 
Please enter a positive number: 
100
What is your best guess as to the number's square root? 
5
The square root of 100.0 is 10.00

Which number's square root would you like to compute? 
Please enter a positive number: 
60
What is your best guess as to the number's square root? 
22
The square root of 60.0 is 7.75


*/
