/*Name: Joshua Dilley
Date: 12/26/2025
Compiler: Apache NetBeans IDE 24
Project: Absolute Java 5th Edition Problem 2.11
Source Code: ThreeClassroomExercises.java
Action: Enter the scores for three classroom projects and display the total 
grade percentage using DecimalFormat class.

 */
package absolutejava;
import java.util.Scanner;
import java.text.DecimalFormat;
public class ThreeClassroomExercises 
{
    static final int EXERCISE_ONE = 10;
    static final int EXERCISE_TWO = 12;
    static final int EXERCISE_THREE = 8;
    static final int MAXIMUM_POINTS = 30;
    
    
    public static void main(String[] args) 
    {
        int ScoreGroupProject;
        int ScoreHomework;
        int ScorePresentation;
        int TotalScore;
        float PercentageScore;
        
        DecimalFormat A = new DecimalFormat("0.00%");
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Name of exercise 1:");
        System.out.println("Group Project");
        System.out.println("Score received for exercise 1:");
        ScoreGroupProject = Input.nextInt();
        System.out.println("Total points possible for exercise 1:");
        System.out.println(EXERCISE_ONE);
        
        System.out.println("Name of exercise 2:");
        System.out.println("Homework");
        System.out.println("Score received for exercise 2:");
        ScoreHomework = Input.nextInt();
        System.out.println("Total points possible for exercise 2:");
        System.out.println(EXERCISE_TWO);
        
        System.out.println("Name of exercise 3:");
        System.out.println("Presentation");
        System.out.println("Score received for exercise 3:");
        ScorePresentation = Input.nextInt();
        System.out.println("Total points possible for exercise 3:");
        System.out.println(EXERCISE_THREE);
        System.out.println();
        
        TotalScore = ScoreGroupProject + ScoreHomework + ScorePresentation;
        PercentageScore = ((float)TotalScore/MAXIMUM_POINTS);
        
        
        System.out.printf("%s %18s %29s", "Exercise", "Score", "Total Possible");
        System.out.println();
        System.out.printf("%s %10d %20d", "Group Project", ScoreGroupProject, EXERCISE_ONE);
        System.out.println();
        System.out.printf("%s %14d %21d", "Homework", ScoreHomework, EXERCISE_TWO);
        System.out.println();
        System.out.printf("%s %10d %20d", "Presentation", ScorePresentation, EXERCISE_THREE);
        System.out.println();
        System.out.printf("%s %18d %20d", "Total", TotalScore, MAXIMUM_POINTS);
        System.out.println("\n");
        System.out.println("Your total is " + TotalScore + " out of " + MAXIMUM_POINTS + ", or " + A.format(PercentageScore) + ".");
        
        System.out.println("\n\n");
        
        
        
        
        
        
    }
    
}

