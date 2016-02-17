// Dylan Leh, Jessica Morris, ________, ________
// Feb 10, 2016
// Cisc 181
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double deposit = 10000-2642;
		double total = 1454485.55;
		for (int i = 1; i < 241; i++){
			total += total*(.02/12);
			total -= 10000-2642;
			System.out.println(i +": " + total);
		}
		
	}

}
