/*Name: Joshua Dilley
Date: 04/18/2025
Programming Project: Absolute Java 1.1
Source Code: BodyMassIndex.java
Action: User enters weight in kilograms and height in meters. The program calculates
body mass index.

 */
package absolutejava;
import java.util.*;
public class BodyMassIndex 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        float Height = 0, Weight = 0, BodyMassIndex = 0;
        
        System.out.print("\nPlease enter the patients weight in kilogams: ");
        Weight = Input.nextFloat();
        System.out.print("\nPlease enter the patients height in meters: ");
        Height = Input.nextFloat();
        
        BodyMassIndex = Weight/(float)(Math.pow(Height, 2));
        
        System.out.println("\nThe patient's BMI is " + BodyMassIndex);
        System.out.println("\nHealthy BMI between 18 and 25.");
    }
}
