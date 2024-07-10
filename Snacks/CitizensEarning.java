import java.util.Scanner;

public class CitizensEarning{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
		
	double salary = 0;
	double tax = 0;
	String citizensName = "";
	
 	TaxCalculator taxPercent = new TaxCalculator();

		for(int counter = 0; counter < 3; counter++){
			System.out.printf("%nCitizen (%d), Enter your name: ", counter+1);
			citizensName = input.next();

			System.out.printf("%nCitizen (%d), enter your salary amount: ", counter + 1);
			salary = input.nextDouble();
			tax = taxPercent.calculate(salary);
			System.out.println("The tax balance due for " + citizensName + " is "+tax);

		}	

	}
}

