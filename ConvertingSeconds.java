/*Name: Joshua Dilley
Date: 05/24/2025
Problem: Absolute Java 1.7
Source Code: ConvertingSeconds.java
Action: Convert seconds to hours, minutes, and seconds.
*/
package absolutejava;
import java.util.*;
public class ConvertingSeconds 
{
    public static void main(String[] args) 
    {
        Scanner Input = new Scanner(System.in);
        int NumberOfSeconds = 0;
        int Hours = 0;
        int Minutes = 0;
        int Seconds = 0;
        int TimeLeft = 0;
        
        System.out.print("Please enter the number of seconds to be converted: ");
        NumberOfSeconds = Input.nextInt();
        
        Hours = NumberOfSeconds/3600;
        TimeLeft = NumberOfSeconds % 3600;
        Minutes = TimeLeft /60;
        Seconds = TimeLeft % 60;
        
        System.out.println(Hours + " hours " + Minutes + " minutes " + Seconds + " seconds ");
    }
}
/* **************************Program Output************************************
Please enter the number of seconds to be converted: 50391
13 hours 59 minutes 51 seconds 

Please enter the number of seconds to be converted: 0
0 hours 0 minutes 0 seconds 

Please enter the number of seconds to be converted: 61
0 hours 1 minutes 1 seconds 

Please enter the number of seconds to be converted: 3661
1 hours 1 minutes 1 seconds 
*/
