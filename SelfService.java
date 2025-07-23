/*Name: Joshua Dilley
Date: 07/23/2025
Source Code: SelfService.java
Action: Demonstrates how to read in different classes of objects, and how to 
diplay those objects utilizing printf.
*/
package absolutejava;
import java.util.Scanner;
public class SelfService 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        int Count;
        double Price, Total;
        
        System.out.println("Enter the number of items purchased ");
        System.out.println("followed by the cost of each item.");
        System.out.println("Do not use a dollar sign.");
        
        Count = Input.nextInt();
        Price = Input.nextDouble();
        Total = Count * Price;
        
        System.out.printf("%d item(s) at $%.2f each.%n", Count, Price);
        System.out.printf("Total amount due $%.2f.%n", Total);
        System.out.println("Please take your shit.");
        System.out.printf("Place $%.2f in an envelope %n", Total);
        System.out.println("and slide it under the office door.");
        System.out.println("Thank you for using Company Kitchen.");
    }
}
/* ****************************Program Output*********************************
Enter the number of items purchased 
followed by the cost of each item.
Do not use a dollar sign.
100
2.98
100 item at $2.98 each.
Total amount due $298.00.
Please take your shit.
Place $298.00 in an envelope 
and slide it under the office door.
Thank you for using Company Kitchen.
*/