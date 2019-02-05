package bootcampProjects;

import java.util.Scanner;

public class ChangeMaker{

	public static void main(String[] args) {
		System.out.println("Enter total amount (in cents) to be calculated:");
		Scanner sc = new Scanner(System.in);
		int cents = sc.nextInt();

		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;


		int totalQuarter = (cents / quarter); 
		cents %= quarter;
		int totalDime = (cents / dime);
		cents %= dime;
		int totalNickel = (cents / nickel);
		cents %= nickel;
		int totalPenny = (cents / penny);
		cents %= penny;
		
		System.out.println("Total quarters: " + totalQuarter);
		System.out.println("Total dimes: " + totalDime);
		System.out.println("Total nickels: " + totalNickel);
		System.out.println("Total pennies: " + totalPenny);
		
	}
}