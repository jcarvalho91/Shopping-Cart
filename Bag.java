import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Bag extends Price implements ShoppingBag {

	static Scanner input = new Scanner(System.in);

	// Variables
	private String newName;
	private int choice;
	private int quantity;

	// Array Lists
	public static ArrayList<String> cart = new ArrayList<String>();
	public static List<Double> bagPrice = new ArrayList<Double>();
	public List<Double> total = new ArrayList<Double>();
	public List<String> missingItems = new ArrayList<String>(newProduct);

	// Prompt user to enter it's name
	public void setName(String name) {
		System.out.println("\n\nWhat's Your Name?");
		name = input.nextLine();
		name = name.replaceAll("\\d", ""); // regex - remove any numbers from a name
		newName = name;
	}

	// Return User's Name
	public String getName() {
		return newName;
	}

	// Let's Go Shopping

	@SuppressWarnings("static-access")
	public void addProduct() {
		Bag item = new Bag();
		System.out.println("Hello! " + getName() + "," + " Let's Go Shopping");
		double total = getBankAccount();

		// Loop until the sum of bagPrice is valued below $58.00
		while (sum(bagPrice) <= 58.00 && total > 0.00) {
			System.out.println();
			System.out.println("Choose a Priority");
			item.choice = input.nextInt();
			System.out.println("Choose a Quantity");
			quantity = input.nextInt();

			/*
			 * If the chosen priority matches an available value in the
			 * newPriority array, then match that priority integer value to the
			 * the index in newPriority, the index in newProduct and the index
			 * in the price array list. Add each of those values to the cart and
			 * bagPrice array list.
			 */

			if (IntStream.of(newPriority).anyMatch(x -> x == item.choice)) {

				// add products to the cart array
				item.cart.add(newProduct.get(item.choice - 1));

				// System.out.println(newProduct.get(7));

				// format prices to show with 2 decimal places
				System.out.print("\tITEM PRICE: " + "$ " + Double.valueOf(formatter.format(price.get(item.choice - 1))));

				// (item.choice - 1) is to ensure that fist price in the array
				// starts at Index 0
				bagPrice.add(price.get(item.choice - 1) * quantity);

				// subtract product price minus
				total = total - price.get(choice);

				System.out.println();

				System.out.println("\tSHOPPING CART: " + item.cart);
				System.out.println("\tSUBTOTAL: " + Double.valueOf(formatter.format(sum(bagPrice))));
				System.out.println("\nREMAINING BANK ACCOUNT : " + Double.valueOf(formatter.format(total)));
			}

			else

			{
				System.out.println("Priority Does Not Exist");
			}

		}

		System.out.println("-------------------");
		System.out.println("\nBANK ENDING BALANCE: " + Double.valueOf(formatter.format(total)));
	}

	// Calculated the total sum of an array. Used with bagPrice() array list

	public double sum(List<Double> bagPrice) {
		double sum = 0.00;
		for (double s : bagPrice)
			sum = sum + s;
			return sum;
		}

	/**
	 * Print items that have not been purchase Source:
	 * http://stackoverflow.com/a/32833204/5977953(non-Javadoc)
	 * 
	 * @see ShoppingBag#nonPurchasedItems(java.util.List)
	 */

	// Show which products that were not purchased

	@SuppressWarnings("static-access")
	public void nonPurchasedItems(List<String> itemsLeft) {

		// instantiate in order to get correct values in missingItems array
		Bag b = new Bag();
		b.missingItems.removeAll(b.cart);
		System.out.println("\nItems Not Purchased: " + b.missingItems);

	}
}
