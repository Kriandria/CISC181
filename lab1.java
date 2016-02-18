
// AS SOON AS YOU SEE THIS FILE, CLICK EDIT IN THE UPPER RIGHT HAND CORNER OF THIS DIALOG BOX, AND REPLACE A BLANK SPACE
// FROM LINE 5 WITH YOUR NAME. dont forget to commit the changes :D

// Dylan Leh, Jessica Morris, Peter Bohdjelian, Hayley Andrews
// Feb 10, 2016
// Cisc 181
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your required income: ");
		float RequiredIncome = scan.nextFloat();
		System.out.print("Please enter your monthly SS income: ");
		float MonthlySSIncome = scan.nextFloat();
		System.out.print("Please enter your annual retirment rate (no percent sign): ");
		byte AnnualRetirement = scan.nextByte();
		System.out.print("Please enter how many years you plan to be retired: ");
		byte RetiredYears = scan.nextByte();
		System.out.print("Please enter your annual savings rate (no percent sign): ");
		byte AnnualReturn = scan.nextByte();
		System.out.print("Please enter how many more years you plan on working: ");
		byte numberOfYears = scan.nextByte();
		scan.close();
		System.out.println();
        double TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirement/100.0)/12,RetiredYears*12 )))))/((AnnualRetirement/100.0)/12);
        double SaveMonthly = TotalSaving*(((AnnualReturn/100.0)/12)/((Math.pow(1+(AnnualReturn/100.0)/12, numberOfYears*12))-1));
        System.out.println("How much to save monthly: "+ String.format("%.5g%n", SaveMonthly));
        
	}

}

