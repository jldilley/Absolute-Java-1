/*Name: Josh Dilley
Date: 12/31/2025
Compiler: Apache NetBeans IDE 24
Project: Absolute Java 5th Edition Problem 2.13
Action: Read in a file that calculates ideal body weight and then deisplays the 
information along with the person's name.
*/
package absolutejava;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IdealBodyWeightFile 
{
    
    static final int INITIAL_WEIGHT  = 110;
    
    public static void main(String[] args)
    {

        Scanner FileIn = null;
        String PatientName;
        boolean i = true;
        int Feet = 0;
        int Inches = 0;  
        int ConvertToInches; // Feet x 12 
        int TotalInches = 0; // ConvertToInches + Inches
        int BodyWeightInches = 0; //TotalInches - 60
        int InchesToWeightConversion = 0; //BodyWeightInches * 5
        int IdealBodyWeight = 0; //INITIAL_WEIGHT + InchesToWeightConversion
    
        try
        {
            FileIn = new Scanner(new FileInputStream("IdealBodyWeight.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("FileNotFound");
            System.exit(0);;
        }  
        
        while(FileIn.hasNextLine() && i)
        {

            PatientName = FileIn.nextLine();
            System.out.println(PatientName);
            
            Feet = FileIn.nextInt();
            Inches = FileIn.nextInt();

            ConvertToInches = Feet * 12;  //these probably should have been functions
            TotalInches = ConvertToInches + Inches;
            BodyWeightInches = TotalInches - 60;
            InchesToWeightConversion = BodyWeightInches * 5;
            IdealBodyWeight = INITIAL_WEIGHT + InchesToWeightConversion;
            
            System.out.println(IdealBodyWeight);
             
            if(FileIn.hasNextLine())
                FileIn.nextLine();
            else
                i = false;  //uses a boolean to check the buffer for more
                            //input. If there is nothing there, the boolean
                            //value is false and the loop breaks out.
        }    
        
        FileIn.close();
    }    
}
/* ********************************Program Output******************************
run:
Tom Atto
185
Eaton Wright
135
Cary Oki
165
BUILD SUCCESSFUL (total time: 0 seconds)
*/