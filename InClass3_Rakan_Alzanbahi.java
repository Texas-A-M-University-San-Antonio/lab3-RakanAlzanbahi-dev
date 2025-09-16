/**
 * Name: [Rakan Alzanbahi]
 * Date: [15 Sep 2025]
* Purpose: InClass 3 - 
* [Write a description about this InClass 3 program]
 */

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;
public class InClass3_Rakan_Alzanbahi
{
    public static void main(String[] args) 
    {
        // In-Class 3 Example:
        Scanner input = new Scanner(System.in);
        double side, volume, SurfaceArea;
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of the side of the cube ");
        // Step 2: Read the user's input and store it in a variable.
        side = input.nextDouble();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(side, 3);
          
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        SurfaceArea = 6 * Math.pow(side, 2);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
        System.out.println("the voulme of the cube is " + volume);
        System.out.println("the surface area of the cube is " + SurfaceArea);
    }
}