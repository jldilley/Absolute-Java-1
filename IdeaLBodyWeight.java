/*Name: Joshua Dilley
Date: 05/26/2025
Problem: Absolute Java 6th Edition Chapter 1 Problem 9
Source Code: IdealBodyWeight.java
Action: Calculate a rough estimate of ideal body weight given 110 pounds 
for the first five feet of a person's height and five pounds for each aditional
inch of height.

 */
package absolutejava;
import java.util.*;
public class IdeaLBodyWeight 
{
    public static final int INITIAL_BODY_WEIGHT = 110;
    
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        
        int Feet = 0;
        int Inches = 0;
        int IdealBodyWeight = 0;
        
        System.out.print("Please enter the person's height in feet and inches: ");
        Feet = (Input.nextInt() - 5);
        Inches = Input.nextInt();
        
        IdealBodyWeight = INITIAL_BODY_WEIGHT + (Feet * 60) + (Inches * 5);
        System.out.println("Ideal body weight = " + IdealBodyWeight + " pounds.");
    }
}
/* **************************Program Output************************************
Please enter the person's height in feet and inches: 5 3
Ideal body weight = 125 pounds.

Please enter the person's height in feet and inches: 6 3
Ideal body weight = 185 pounds.
*/
