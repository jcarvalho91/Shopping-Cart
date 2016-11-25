import java.util.*;
import java.util.ArrayList;

public abstract class Product {

	public Scanner keyboard = new Scanner(System.in);

	// 1st ProductArray ->Used to take all products
	public static ArrayList<String> product = new ArrayList<String>();

	/* 2nd Product Array ->Takes a copy of the first array 
	 * and doesn't accept duplicates
	 */
	public static ArrayList<String> newProduct = new ArrayList<String>();

	// 3rd and Final -> will be used for sorting in the Priority class
	public static String[] finalProduct = new String[7];

	
	public static void setProducts(String items) 
	{
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hello! Let's Add Some Products to Our List");
		
		while (newProduct.size() < 7) {

			System.out.println("\nEnter an Item");

			// item takes the product name
			items = keyboard.nextLine(); 
			
			items.equalsIgnoreCase(items); 

			// Add item name to product array list
			product.add(items); 

			/* If items doesn't already exist in the product array list then
			 * add that product to a new array list called newProduct.
			 * newProduct will now be used a clean new array with no duplicate
			 * products
			 */

			for (String nonDuplicate : product) {

				if (!newProduct.contains(nonDuplicate)) {
					newProduct.add(nonDuplicate);

				}
			}
		}

		/* Copy 2nd Product array and into a 3rd and final array This array will
		 * be used for sorting purposes
		 */

		finalProduct = (newProduct.toArray(finalProduct));
	}

	public static ArrayList<String> getProduct() {
		return newProduct;
	}

}
