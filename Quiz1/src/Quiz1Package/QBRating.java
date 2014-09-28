//Mark McFadden
//CISC 181
//Quiz 1

package Quiz1Package;

import java.util.Scanner;

public class QBRating {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		//Asking for user input and assigning integer variables to those inputs.
		System.out.print("Enter in the Quarterback's total touchdowns: ");
		float Touchdowns = input.nextFloat();
		System.out.print("Enter in the Quarterback's total yards completed: ");
		float TotalYards = input.nextFloat();
		System.out.print("Enter in the Quarterback's total interceptions: ");
		float TotalInts = input.nextFloat();
		System.out.print("Enter in the Quarterback's total passes completed: ");
		float TotalPasses = input.nextFloat();
		System.out.print("Enter in the Quarterback's total passes attempted: ");
		float TotalAtt = input.nextFloat();

		
		//Performs required calculations and assigns new double variables to these answers
		double a = (double) (((TotalPasses/TotalAtt) - 0.3) * 5);
		double b = (double) (((TotalYards/TotalAtt) - 3) * .25);
		double c = (double) ((Touchdowns/TotalAtt) * 20);
		double d = (double) (2.375 - ((TotalInts/TotalAtt) * 25));
		
		if (a < 0){
			a = 0;
		}
		
		if (a > 2.375){
			a = (float) 2.375;
			}
		
		if (b < 0){
			b = 0;
		}
		
		if (b > 2.375){
			b = (float) 2.375;
			}
		
		if (c < 0){
			c = 0;
		}
		
		if (c > 2.375){
			c = (float) 2.375;
			}
		
		if (d < 0){
			d = 0;
		}
		
		if (d > 2.375){
			d = (float) 2.375;
			}
		
		
		//Calculates the actual QB rating.
		double QBR = (((a + b + c + d) / 6) * 100);
		
		System.out.println("The Quarterback's QB Rating is " + QBR);
		
		input.close();	
	}
	
}
