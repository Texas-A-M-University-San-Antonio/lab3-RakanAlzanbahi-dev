/**
 * Name [Rakan Alzanbahi]
 * Date [15 Sep 2025]
 * Purpose: Lab3 
 * Description to the program: Calculate the Compound interest.
 */
import java.util.Scanner; // import and declare a Scanner for user input.

public class Lab3_Rakan_Alzanbahi
{
    public static void main(String[] args)
    {
        // Lab3
        Scanner input = new Scanner(System.in); // Scanner
        // Variables (INPUT)
        double initialvalue;
        int numberofelapsedyears;
        double interestrate;
        double finalvalue;
        // prompt the user to enter the initial value and assign it.
        System.out.print("Please enter the initial value of the home = ");
        initialvalue = input.nextDouble();
        // prompt the user to enter the number of elapsed years and assign it.
        System.out.print("Please enter the number of elapsed years = ");
        numberofelapsedyears = input.nextInt();
        // prompt the user to enter the the interest rate and assign it.
        System.out.print("Please enter the interest rate = ");
        interestrate = input.nextDouble();
        double decimalRate = interestrate / 100.0; // here is the conversion of the interest rate from percentage to decimal.
        // the equation of the compound interest. (PROCCESS)
        finalvalue = initialvalue * Math.pow(1 + decimalRate, numberofelapsedyears);
        // print the final value (OUTPUT).
        System.out.println("the final value of the home is " + finalvalue);
    }
}