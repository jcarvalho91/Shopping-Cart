import java.util.ArrayList;

public interface Priceble {
	
	// Set Shopping Budget Amount
	void setBankAccount(double Max); 
	
	// Get Shopping Budget Amount
	double getBankAccount(); 

	// Set Product Prices
	void setPrice(ArrayList<String> newProduct); 
	
	// Get Product Prices
	ArrayList<Double> getPrice(); 

}
