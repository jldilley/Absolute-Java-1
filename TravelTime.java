/*Name: Joshua Dilley
Date: 08/02/2025
Source Code: TravelTime.java
Actio: Reads in the distance in miles and speed in miles per hour. Returns 
the total travel time in hours.
*/
package absolutejava;
import  java.util.Scanner;
public class TravelTime 
{
        public static void main(String[] args) 
        {
            Scanner Input = new Scanner(System.in);
            
            int TravelTimeHours = 0;
            double TravelTimeMinutes = 0, Distance = 0, Speed = 0;
            
            System.out.println("Please enter the distance in miles that you will ");
            System.out.println("be traveling, and the speed at which you are ");
            System.out.println("traveling in miles per hour: ");
            Distance = Input.nextDouble();
            Speed = Input.nextDouble();
            
            TravelTimeHours = (int)(Distance/Speed);
            TravelTimeMinutes = ((Distance%Speed)/Speed)*60;
            
            System.out.printf("%.0f", Distance); System.out.println(" miles");
            System.out.printf("%.0f", Speed);System.out.println(" miles per hour");
            System.out.print("Your travel time is approximately " + TravelTimeHours);
            System.out.printf(" hours and " + "%.0f", TravelTimeMinutes);
            System.out.println(" minutes.");
        }
}
/* ****************************Program Output**********************************
Please enter the distance in miles that you will 
be traveling, and the speed at which you are 
traveling in miles per hour: 
100 88
100 miles
88 miles per hour
Your travel time is approximately 1 hours and 8 minutes.

Please enter the distance in miles that you will 
be traveling, and the speed at which you are 
traveling in miles per hour: 
2000 33
2000 miles
33 miles per hour
Your travel time is approximately 60 hours and 36 minutes.

Please enter the distance in miles that you will 
be traveling, and the speed at which you are 
traveling in miles per hour: 
45 45
45 miles
45 miles per hour
Your travel time is approximately 1 hours and 0 minutes.

Please enter the distance in miles that you will 
be traveling, and the speed at which you are 
traveling in miles per hour: 
30 60
30 miles
60 miles per hour
Your travel time is approximately 0 hours and 30 minutes.
*/