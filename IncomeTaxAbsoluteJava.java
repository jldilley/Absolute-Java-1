/*Name: Joshua Dilley
Date: 1/04/2025
Compiler: Apache NetBeans IDE 24
Project: Absolute Java 5th Edition Example 3.1
Action: use if-else statement to help calculate income tax depending on a 
person's tax bracket
*/
package absolutejava
import java.util.Scanner;
public class IncomeTaxAbsoluteJava 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double NetIncome, Tax, FivePercentTax, TenPercentTax;
        
        System.out.print("Enter your net income: ");
        NetIncome = Input.nextDouble();
        
        if(NetIncome <= 15000)
            Tax = 0;
        else if (NetIncome <= 30000)
            Tax = (0.05*(NetIncome-15000));
        else
        {
            FivePercentTax = 0.05*15000;
            TenPercentTax = 0.10*(NetIncome - 30000);
            Tax = (FivePercentTax + TenPercentTax);
        }
        System.out.printf("Tax due = $%.2f", Tax);
        System.out.println("\n");
    }
}
/* ******************************Program Output*********************************
run:
Enter your net income: 0
Tax due = $0.00

run:
Enter your net income: 15000
Tax due = $0.00

run:
Enter your net income: 15001
Tax due = $0.05

run:
Enter your net income: 30000
Tax due = $750.00

run:
Enter your net income: 30001
Tax due = $750.10  <-----------------the extra dollar is being taxed at 10%

run:
Enter your net income: 100000
Tax due = $7750.00

*/
