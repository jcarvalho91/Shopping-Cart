import java.util.List;

public interface ShoppingBag {

	// Ask for user's name
	void setName(String name); 
	
	
	// Return User name
	String getName();
	
	
	/* Ask user for priority and product to 
	 * shopping that corresponds that priority 
	 */
	 
	void addProduct();


	/*Calculate the Sum of bagPrice array
	 * This will be used to determine if conditional is true
	 */
	
	double sum(List<Double> bagPrice);
	
	
	// Print which products were not purchased
	void nonPurchasedItems(List<String> itemsLeft); 
	
	
}
