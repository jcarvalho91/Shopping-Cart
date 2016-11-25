import java.util.*;

public abstract class Priority extends Product {

	// Instantiate
	private static String temp;
	private static int temp2;

	public static ArrayList<Integer> priority = new ArrayList<Integer>();
	public static int[] newPriority = new int[priority.size()];

	private static int value;

	/* Method - Set product priority try/catch exception 
	 * if input is not an integer
	 */
	public void setPriority() {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		for (String count : newProduct)

			try 
				{

					System.out.println("\nEnter a priority for:   " + count);
	
					value = input.nextInt();
	
					priority.add(value);
	
					System.out.println();
				}

			catch (InputMismatchException e) 
			{

				/* If invalid input is entered, program will end to prevent user
				 * from proceeding forward and causing a IndexOutBound error
				 */
				System.out.println("\n\nInvalid Input...Program Will End");
				System.out.println("\nGoodbye");
				System.exit(0);
			}

		// convert ArrayList into Array in order to use Bubble Sort
		newPriority = priority.stream().mapToInt(i -> i).toArray();
		

		//sortBubbleTest(newPriority);  // [BUG] -> sorting not working correctly 
	
		sortBubble(newPriority); 
		
	}
	
	 // Source: https://www.youtube.com/watch?v=RqfWvIsYmsc
	public static void sortBubble(int[] array)  
	{
		for (int i = array.length-1; i > 0; i--)
		{
			for (int j=0; j < i; j++)
			{
				if (array[j]> array[j+1])
				{
					int temp1 = array[j]; 
					array[j]= array[j+1];
					array[j+1] = temp1; 
				}
			}
		}
	}
	
	/* NOTE: 
	 * The second method below is an attempt to sort priorities 
	 * in parallel to products. Although, the code below fails to 
	 * sort both priorities and product. This is just a copy of the 
	 * method below. In this program, it's not being used. 
	 *  Source: https://www.youtube.com/watch?v=RqfWvIsYmsc
	 */
	
	
	public static void sortBubbleTest(int[] newPriority2)
	{

		for (int n = 0; n < 7; n++) 
		{

			for (int m = 0; m < 6 - n; m++) 
			{

				if ((finalProduct[m].compareTo(finalProduct[m + 1])) > 0) 
				{
					temp = finalProduct[m];

					finalProduct[m] = finalProduct[m + 1];

					finalProduct[m + 1] = temp;

					// sort second array together [BUG]

					temp2 = newPriority[m];

					newPriority[m] = newPriority[m + 1];

					newPriority[m + 1] = temp2;
				}
			}
		}
		
		for (int n = 0; n < 7; n++) 
		{
			System.out.println(finalProduct[n]);
			System.out.print(newPriority[n]);
		}				
	}	
}


