/*Name: Joshua Dilley
Date: 05/26/2025
Problem: Absolute Java 1.7
Source Code: VehicleAverageSpeed.java
Action: Calculate a vehicle's average speed given time and distnace. Hard coded 
in order to follow the problem's solution.

 */
package absolutejava;
public class VehicleAverageSpeed 
{
    public static final double DISTANCE = 180;
    
    public static void main(String[] args) 
    {
        double Time = 20.5;
        double AverageSpeed = DISTANCE/Time;
        
        System.out.println("This program calculates vehicle average speed given a time and distanc traveled. ");
        System.out.print("The car's average speed is ");
        System.out.printf("%.2f", AverageSpeed);
        System.out.println(" miles per hour.");
    }
}

/* ******************************Program Output********************************
This program calculates vehicle average speed given a time and distanc traveled. 
The car's average speed is 8.78 miles per hour.
*/
