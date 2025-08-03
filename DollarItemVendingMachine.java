/*Name: Joshua Dilley
Date;08/03/2025
Problem: Chapter Two Programming Project 7 Absolute Java 6th Edition
Source Code: DollarItemVendingMachine.java
Action: Calculates the amount of change and denominations dispensed from a 
dollar item vending machine. Machine takes one dollar. All itmes cost between
$0.25 and $1.00 in increments of $0.05.
*/
package absolutejava;
import java.util.Scanner;
public class DollarItemVendingMachine 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double Price, TotalChange;
        int Change, Quarters, Dimes, Nickels;
        
        System.out.print("Please enter the price of your item. ");
        System.out.println("All items cost between $0.25 and $1.00 in increments ");
        System.out.print("of $0.05. Do not include the dollar sign: ");
        Price = Input.nextDouble();
        
        Price = Price * 100;
        Change = (int)(100 - Price);
        Quarters = Change/25;
        Change = Change - (Quarters*25);
        Dimes = Change/10;
        Change = Change - (Dimes*10);
        Nickels = Change/5;
        TotalChange = (100.00 - Price) * 0.01;
        
        System.out.println("Your change due is: ");
        System.out.println(Quarters + " quarters ");
        System.out.println(Dimes + " dimes ");
        System.out.println(Nickels + " nickels ");
        System.out.printf("For a total of $" + "%.2f", TotalChange);
        System.out.println(" ");
    }
}
/* ***************************Progrma Output***********************************
Please enter the price of your item. All items cost between $0.25 and $1.00 in increments 
of $0.05. Do not include the dollar sign: 0.45
Your change due is: 
2 quarters 
0 dimes 
1 nickels 
For a total of $0.55

Please enter the price of your item. All items cost between $0.25 and $1.00 in increments 
of $0.05. Do not include the dollar sign: 0.25
Your change due is: 
3 quarters 
0 dimes 
0 nickels 
For a total of $0.75

Please enter the price of your item. All items cost between $0.25 and $1.00 in increments 
of $0.05. Do not include the dollar sign: 0.95
Your change due is: 
0 quarters 
0 dimes 
1 nickels 
For a total of $0.05

Please enter the price of your item. All items cost between $0.25 and $1.00 in increments 
of $0.05. Do not include the dollar sign: 0.50
Your change due is: 
2 quarters 
0 dimes 
0 nickels 
For a total of $0.50 

Please enter the price of your item. All items cost between $0.25 and $1.00 in increments 
of $0.05. Do not include the dollar sign: 0.35
Your change due is: 
2 quarters 
1 dimes 
1 nickels 
For a total of $0.65 

*/