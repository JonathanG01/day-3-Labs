import java.util.Scanner;

public class Converter{	
	public static void main(String[] args) {
		
		int menuSelection;
		Menu();	
		Scanner scan = new Scanner(System.in);
		menuSelection = scan.nextInt();
				
		while (menuSelection != 4)   {
		switch (menuSelection) {
		case 1:	System.out.println("choose how many yards you want to convert: "); 
		int yards = scan.nextInt(); yardsToFeet(yards, 3); 
		break;
		case 2: System.out.println("choose how many miles you want to convert: "); 
		int miles = scan.nextInt(); milesToKm(miles,1.61); break;
		case 3:  System.out.println("choose how many centimeters you want to convert: ");
		int cm = scan.nextInt(); cmToMeters(cm, .01); break;		
		case 4: System.out.println("you have exited the program!")
		}
		
		System.out.println("you're back to first menu, pick another option.");
		menuSelection = scan.nextInt();

	}
		
	}
	public static void Menu() {
		System.out.println("Choose an option: ");	
		System.out.println("1) Yards to feet.");
		System.out.println("2) Miles to kilometers.");
		System.out.println("3) Centimiters to meters.");
		System.out.println("4) Quit.");
	}
	public static void yardsToFeet(int yards, final int f) {
		System.out.println( yards + " yards = " + yards * f +" feet.");
	}
	public static void milesToKm (int miles, final double Km) {
		System.out.println(miles + " miles = " + miles * 1.61 + " Kilometers.");
	}
	public static void cmToMeters(int cm, final double M) {
		System.out.println(cm + " centimeters = " + (cm*M) + " Meters.");
	}
}
