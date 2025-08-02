/*Name: Joshua Dilley
Date: 08/02/2025
Source Code: DivisionOperation.java
Action: Reads in two numbers. Divides the numbers and displays the dividend, 
divisor, quotient, and remainder.

 */
package absolutejava;
import java.util.Scanner;
public class DivisionOperation 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        int Dividend = 0, Divisor = 0, Quotient = 0, Remainder = 0;
        
        System.out.println("Please enter a number to divide and the ");
        System.out.println("number by which it is to be divided.");
        
        Dividend = Input.nextInt();
        Divisor = Input.nextInt();
        
        Quotient = Dividend/Divisor;
        Remainder = Dividend % Divisor;
        
        System.out.println("Dividend: " + Dividend);
        System.out.println("Divisor: " + Divisor);
        System.out.println("Quotient: " + Quotient);
        System.out.println("Remaider: " + Remainder);
    }
}

/* ****************************Program Output**********************************
Please enter a number to divide and the 
number by which it is to be divided.
1 2
Dividend: 1
Divisor: 2
Quotient: 0
Remaider: 1

Please enter a number to divide and the 
number by which it is to be divided.
3 2
Dividend: 3
Divisor: 2
Quotient: 1
Remaider: 1

Please enter a number to divide and the 
number by which it is to be divided.
9
6
Dividend: 9
Divisor: 6
Quotient: 1
Remaider: 3

Please enter a number to divide and the 
number by which it is to be divided.
23
8
Dividend: 23
Divisor: 8
Quotient: 2
Remaider: 7
*/