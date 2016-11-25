import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class productPrinter extends ShoppingList  {

	private String filename;

	public void report(String[] args) 
	{

		filename = "ProductList.txt";

		PrintWriter outputStream = null;

		Scanner input = new Scanner(System.in);

		try 
		{
			outputStream = new PrintWriter(filename);
		}

		catch (FileNotFoundException e) 
		{
			System.out.println("Error opening " + filename);
			System.exit(0);
		}

		System.out.println("\nA Summary of Your Purchase Can be Found in: " + filename);

		outputStream.println("Product\t\t" + "Price");

		outputStream.println("---------------------");

		for (int count = 0; count < cart.size(); count++) 
		{

			outputStream.println("\n");

			outputStream.println(" " + cart.get(count) + "\t\t" + "$ " + Double.valueOf(formatter.format(price.get(count))));
		}

		outputStream.println("---------------------");
		outputStream.println("BAG TOTAL: " + "$ " + Double.valueOf(formatter.format(sum(bagPrice))));

		outputStream.close();
		input.close();

	}
}
