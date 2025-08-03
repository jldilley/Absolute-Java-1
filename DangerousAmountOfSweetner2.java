/*Name: Joshua Dilley
Date: 08/03/2025
Problem: Absolute Java 6th Edition Programming project 6 Chapter 2
Source Code: DangerousAmountOfSweetner2.java
Action: Same as the first, but now the program reads in input from the user instead
of hardcoding the information into the program.
*/
package absolutejava;
import java.util.Scanner;
public class DangerousAmountOfSweetner2 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        double AmountToKillMouse, DangerousAmount, AmountToKillDieter;
        int MouseWeight, DesiredWeight, DangerousAmountOfLiters;
        
        System.out.print("Please enter the amount required to kill a mouse ");
        System.out.print("in grams: ");
        AmountToKillMouse = Input.nextDouble();
        System.out.print("Please enter the weight of the mouse in grams: ");
        MouseWeight = Input.nextInt();
        System.out.print("Please enter the dieter's desired final weight: ");
        DesiredWeight = Input.nextInt();
        
        DangerousAmount = AmountToKillMouse/MouseWeight;
        AmountToKillDieter = DangerousAmount * DesiredWeight;
        DangerousAmountOfLiters = (int)(AmountToKillDieter * 1000);
        
        System.out.print("It would take " + DangerousAmountOfLiters + " liters to ");
        System.out.println("kill the dieter.");
    }
}
/* *****************************Program Output********************************
Please enter the amount required to kill a mouse in grams: .001
Please enter the weight of the mouse in grams: 20
Please enter the dieter's desired final weight: 20000
It would take 1000 to kill the dieter.

Please enter the amount required to kill a mouse in grams: .001
Please enter the weight of the mouse in grams: 20
Please enter the dieter's desired final weight: 54431
It would take 2721 liters to kill the dieter.

*/