import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ShoppingList extends Bag {

	Bag report = new Bag();

	public NumberFormat formatter = new DecimalFormat("#.00");

	public void getShoppingList() 
	{

		NumberFormat formatter = new DecimalFormat("#.00");

		System.out.println();
		System.out.println("\n---------------------------------------");
		System.out.println("Priority    " + "   Product" + "\t\tPrice");
		System.out.println("---------------------------------------");

		for (int count = 0; count < 7; count++) 
		{
			System.out.println();
			System.out.print(newPriority[count] + "\t\t");
			System.out.print(newProduct.get(count) + "\t\t");
			System.out.print("$ " + Double.valueOf(formatter.format(price.get(count))));

		}
		System.out.println("\n---------------------------------------");

	}

	public void purchasedItems() 
	{
		System.out.println("\n-------------------");
		System.out.println("ITEMS PURCHASED");
		System.out.println("-------------------");

		for (int count = 0; count < cart.size(); count++) 
		{
			System.out.println(cart.get(count));
			// System.out.println(bagPrice.get(count));
		}

		System.out.println("------------------");
		System.out.println("BAG PRICE:" + "$ " + Double.valueOf(formatter.format(sum(bagPrice))));
	}

}
