import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;


public abstract class Price extends Priority implements Priceble {
	

	// Price number formatter
	public static NumberFormat formatter = new DecimalFormat("#.00");

	// Instantiate - Objects
	public Scanner keyboard = new Scanner(System.in);
	public static ArrayList<Double> price = new ArrayList<Double>();

	// variables
	private double Max;
	private double Min = 0.00;

	// Set Budget

	public void setBankAccount(double newMax) {
		Max = newMax;
	}

	// Get Budget
	public double getBankAccount() {
		return Max;
	}

	// Set Prices

	public void setPrice(ArrayList<String> newProduct) {
		Random ran = new Random();

		for (int itemPrice = 0; itemPrice < 7; itemPrice++) {

			price.add(Min + (Max - Min) * ran.nextDouble());

		}

		System.out.println("\nBank Account  " + "$ " + getBankAccount());

	}

	// Method - GetPrice
	public ArrayList<Double> getPrice() {
		return price;

	}
}