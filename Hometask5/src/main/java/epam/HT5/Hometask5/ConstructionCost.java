package epam.HT5.Hometask5;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost 
{
	private static Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
	public void menu() {
		int choice;
		double area;
		Scanner scanner = new Scanner(System.in);
		LOGGER.error("1. Standard Material(1200 psf).");
		LOGGER.error("2. Above Standard Material(1500 psf).");
		LOGGER.error("3. High Standard Material(1800 psf).");
		LOGGER.error("4. High Standard Material and fully Automated Home(2500 psf).");
		LOGGER.error("Select an option : ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 : LOGGER.error("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 LOGGER.error("Total cost required = " + (1200 * area) +" INR");
				 break;
		case 2 : LOGGER.error("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 LOGGER.error("Total cost required = " + (1500 * area)+" INR");
		 		 break;
		case 3 : LOGGER.error("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 LOGGER.error("Total cost required = " + (1800 * area) +" INR");
		         break;
		case 4 : LOGGER.error("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 LOGGER.error("Total cost required = " + (2500 * area) +" INR");
				 break;
		default: LOGGER.error("Enter a valid Choice.");
		}
	}
}
