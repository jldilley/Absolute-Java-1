/*Name: Joshua Dilley
Date: 05/18/2025
Programming Project: Absolute Java: 1.5
Source Code: HateToLove.java
Action: Locates the word "hate" in your sentence and swaps it out for "love".
The problem asked the programmer to use a global constant for the original String. 

 */
package absolutejava;

public class HateToLove 
{
    final static String Sentence = "Wow, hate is a powerful thing."; 
    
    public static void main(String[] args) 
    {
        int PositionOfHate = Sentence.indexOf("hate");
        String Love = "love";
        String Beginning = Sentence.substring(0, PositionOfHate);
        String Ending = Sentence.substring(PositionOfHate + "hate".length()); //this will calculate for the white space after "hate"
        
        System.out.print("The line of text to be changed is: ");
        System.out.println(Sentence);
        
        System.out.print("The position of \"hate\" is located at index " + PositionOfHate + ".\n");
        
        System.out.print("The new line of text reads: ");
        System.out.println(Beginning + Love + Ending + "\n");
    }
}

/* *************************Program Output*************************************
The line of text to be changed is: I hate you.
The position of "hate" is located at index 2.
The new line of text reads: I love you.

The line of text to be changed is: Wow, hate is a powerful thing.
The position of "hate" is located at index 5.
The new line of text reads: Wow, love is a powerful thing.

******************************************************************************/