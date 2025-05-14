/*Name: Joshua Dilley
Date: 05/14/20265
Programming Project: Absolute Java 1.4
Source Code: DangerousAmountOfSweetner.java
Action: Calculates the amount of sweetner that would kill a dieter by first
finding the amount dangerous to a mouse. All variables are hard coded.
Weights are in grams.

 */
package absolutejava;

public class DangerousAmountOfSweetner 
{
    public static void main(String[] args) 
    {
        final double AmountToKillMouse = 0.001;
        final int MouseWeight = 20;
        final int DesiredWeight = 54431;
        
        double DangerousAmount;
        double AmountToKillDieter;
        int DangerousAmountOfLiters;
        
        DangerousAmount = AmountToKillMouse/MouseWeight;
        AmountToKillDieter = DangerousAmount * DesiredWeight;
        DangerousAmountOfLiters = (int)(AmountToKillDieter * 1000);
        
        System.out.println("It would take " + DangerousAmountOfLiters + " liters to kill the dieter.");
    }
}
/* *****************************Program Output*********************************
It would take 2721 liters to kill the dieter.

*/
