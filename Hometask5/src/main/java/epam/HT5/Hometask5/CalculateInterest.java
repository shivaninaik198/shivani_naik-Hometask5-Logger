package epam.HT5.Hometask5;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateInterest {
	double amount, time, rate;
	private static Logger LOGGER = LogManager.getLogger(ConstructionCost.class);
	public void read() {
		Scanner sc = new Scanner(System.in);
		LOGGER.error("Enter the Principal Amount : ");
		amount = sc.nextDouble();
		LOGGER.error("Enter the Time Period : ");
		time = sc.nextDouble();
		LOGGER.error("Enter the Rate of Interest : ");
		rate = sc.nextDouble();
		double s_interest = calculateSimpleInterest();
		LOGGER.error("Simple Interest = "+ s_interest+" INR");
		double c_interest = calculateCompoundInterest();
		LOGGER.error("Compound Interest = "+ c_interest+" INR");
	}
	public double calculateSimpleInterest() {
		return (amount * time * rate)/100;
	}
	public double calculateCompoundInterest() {
		return (amount *(Math.pow(1+(rate/100), time) - 1));
	}
}
