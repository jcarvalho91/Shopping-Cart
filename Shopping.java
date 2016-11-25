import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Shopping List - MAIN CLASS
 *  @author julianacarvalho
 */

public class Shopping {

	private static double newMax;
	private static String items;

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		Bag price = new Bag();

		ShoppingList list = new ShoppingList();

		productPrinter printer = new productPrinter();

		// PRODUCT CLASS

		// Set products
		ShoppingList.setProducts(items);

		// Show Products
		System.out.println("\n\nYou Have Entered: " + ShoppingList.getProduct());

		
		
		// PRIORITY CLASS
		list.setPriority();

		
		
		// PRICE CLASS

		try {

			System.out.println("Enter A Budget");
			newMax = keyboard.nextDouble();

			if (newMax > 58.00) 
			{
				System.out.println("\nBudget Must Be Below $58.00");
				System.out.println("\nTry One More Time . . .Enter A Budget");
				newMax = keyboard.nextDouble();
				if (newMax> 58.00){
					System.out.println("Sorry! Application Will Now End");
					System.exit(0);
				}
			}
		}

		catch (InputMismatchException e) {

			System.out.println("\nInvalid Input. System Will Now Exit");
			System.exit(0);
		}

		price.setBankAccount(newMax);

		// Set Prices
		price.setPrice(null);

		
		
		// Let's go Shopping ...

		
		
		// SHOPPING LIST CLASS

		// Show products available for purchase
		list.getShoppingList();

		
		
		// BAG CLASS 

		// What's your name?
		String name = null;

		price.setName(name);

		// Choose items to purchase and add products to shopping bag
		price.addProduct();

		
		
		// SHOPPING LIST CLASS

		// Show products that were purchased
		list.purchasedItems();

		// What products you did not purchase
		List<String> itemsLeft = null;
		list.nonPurchasedItems(itemsLeft);

		
		
		// PRINT REPORT

		// Export shopping list to a text file
		printer.report(args);

		keyboard.close();

	}
}
