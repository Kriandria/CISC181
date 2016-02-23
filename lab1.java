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
		System.out.print("Please enter your annual retirment rate (between 0-20): ");
		byte AnnualRetirement = scan.nextByte();
		while (AnnualRetirement > 20 || AnnualRetirement <0) {
			System.out.println("Please enter your annual retirment rate (between 0-20): ");
			AnnualRetirement = scan.nextByte();
		}
		System.out.print("Please enter how many years you plan to be retired: ");
		byte RetiredYears = scan.nextByte();
		System.out.print("Please enter your annual savings rate (between 0-3): ");
		byte AnnualReturn = scan.nextByte();
		while (AnnualRetirement > 20 || AnnualRetirement <0) {
			System.out.print("Please enter your annual savings rate (between 0-3): ");
			AnnualReturn = scan.nextByte();
		}
		System.out.print("Please enter how many more years you plan on working: ");
		byte numberOfYears = scan.nextByte();
		scan.close();
		System.out.println();
        double TotalSaving = (RequiredIncome-MonthlySSIncome)*((1-(1/(Math.pow(1+(AnnualRetirement/100.0)/12,RetiredYears*12 )))))/((AnnualRetirement/100.0)/12);
        double SaveMonthly = TotalSaving*(((AnnualReturn/100.0)/12)/((Math.pow(1+(AnnualReturn/100.0)/12, numberOfYears*12))-1));
        System.out.println("How much to save monthly: $"+ String.format("%.5g%n", SaveMonthly));
        
	}

}

