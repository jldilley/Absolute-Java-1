/*Name: Joshua Dilley   
Date: 12/27/2025
Compiler: Apache NetBeans IDE 24
Project: Absolute Jave 5th Edition Problem 2.12
Source Code: HateToLoveFileRead.java
Action: Reads in a file, looks for the first instance of the word "hate", and 
changes it to "love".

 */
package absolutejava;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HateToLoveFileRead 
{
    public static void main(String[] args) 
    {
        Scanner FileIn = null;
        String File;
        String Love = "love";
        String NewFile;

        try
        {
            FileIn = new Scanner(new FileInputStream("Hate2.txt"));
        }    
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            System.exit(0);
        }   
        File = FileIn.nextLine();
        
        int PositionOfHate = File.indexOf("hate");
        String Beginning = File.substring(0, PositionOfHate);
        String Ending = File.substring(PositionOfHate + "hate".length());
        NewFile = Beginning + Love + Ending;
        
        System.out.println(NewFile);
        
        FileIn.close();    
    }
    
}
/* ******************************Program Output********************************
I love to hate. 


*/
