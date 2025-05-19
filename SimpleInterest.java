/*Name: Joshua Dilley
Date: 05/19/2025
Problem: Absolute Java 1.6
Source Code: SimpleInterest.java
Action: Calculate simple interest. Hard coded for the figures that the problem 
calls for. 

 */
package absolutejava;

public class SimpleInterest 
{
    public static void main(String[] args) 
    {
        int PrincipalAmount = 1000;
        int NumberOfYears = 5;
        
        double InterestRate = 5.00;
        double SimpleInterest = 0.00;
        
        SimpleInterest = (PrincipalAmount * InterestRate * NumberOfYears)/100;
        
        System.out.print("Simple interest = $");
        System.out.printf("%.2f", SimpleInterest);
        System.out.print("\n");        
    }
}
/* *****************************Program Output********************************
Simple interest = $250.00
*/
