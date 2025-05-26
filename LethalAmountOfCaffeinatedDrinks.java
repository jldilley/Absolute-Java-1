/*Name: Joshua Dilley
Date: 05/26/2025
Problem: Absolute Java 6th Edition Chapter 1 Problem 10
Source Code: LethalAmountOfCaffeinatedDrinks.java
Action: Calculates the lethal amount of caffeinted drinks that can be imbibed
before consuming a lethal amount of caffeine. 

 */
package absolutejava;
import java.util.*;
public class LethalAmountOfCaffeinatedDrinks 
{
    public static final int LETHAL_AMOUNT_OF_CAFFEINE = 10000;
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        int MilligramsOfCaffeinePerDrink = 0;
        int DeadlyAmountOfDrinks = 0;
        
        System.out.print("How many milligrams of caffeine per drink? --> ");
        MilligramsOfCaffeinePerDrink = Input.nextInt();
        
        DeadlyAmountOfDrinks = LETHAL_AMOUNT_OF_CAFFEINE / MilligramsOfCaffeinePerDrink;
        
        System.out.println(DeadlyAmountOfDrinks + " drinks contains enough caffeine to be deadly. ");
    }
}
/* ****************************Program Output**********************************
How many milligrams of caffeine per drink? --> 160
62 drinks contains enough caffeine to be deadly. 

How many milligrams of caffeine per drink? --> 34
294 drinks contains enough caffeine to be deadly.
*/