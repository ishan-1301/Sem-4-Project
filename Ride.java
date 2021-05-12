import java.text.SimpleDateFormat;
import java.util.Date;

public class Ride {
	//SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
    private double price;
    private boolean purchaseStatus;
    private String category = new String();
    /**
	 * @param number: Represents each <b>Ticket</b> object's unique number as a <b>long</b>.
	 * @param category: Stores each <b>Ticket</b> object's category as a <b>String</b> which is either of "adult', "child" or "senior". 
	 * @param holder: Stores the name of the person who purchased the <b>Ticket</b> object as a <b>String</b>.
	 * @param date: Stores the admission date for the <b>Ticket</b> object as a <b>Date</b>.
	 * @param price: Stores the current price of each <b>Ticket</b> object as a <b>double</b>.
	 * @param purchaseStatus: Represents the purchase status of each <b>Ticket</b> object as a <b>boolean</b>. 
	 */
	
    public Ride(String category,double price, boolean purchaseStatus) {
		
		if (category.equalsIgnoreCase("Ferris Wheel")) {
        	this.category = category;
		} else if(category.equalsIgnoreCase("Rollercoaster")) {
			this.category = category;
		} else if(category.equalsIgnoreCase("Haunted House")){
			this.category = category;
		} else if(category.equalsIgnoreCase("Merry Go Round")){
			this.category = category;
		} else if(category.equalsIgnoreCase("Dodgems")){
			this.category = category;
		} else if(category.equalsIgnoreCase("Water Ride")){
			this.category = category;
		}else{
			System.out.println("Invalid ticket category. Please, talk to a member of staff.");
		}
		
		this.price = price;
		this.purchaseStatus = purchaseStatus;
	}
    
    /**
     * Constructor method for the <b>Ticket</b> class. This constructor accepts no arguments and sets all values to <b>'null'</b>
     * and boolean values to <b>false</b>.
     */
    public Ride() {
	}

	/**
	 * Returns the price of the current <b>Ticket</b> object as a <b>double</b>.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Used to change the Purchase status of a <b>Ticket</b> object.
	 */
	public void changePurchaseStatus(boolean newValue){
		this.purchaseStatus = newValue;
	}
	
	/**
	 * Used to get the purchase status of a <b>Ticket</b> object. Returns a boolean value.
	 */
	public boolean getPurchaseStatus(){
		boolean status;
		if (this.purchaseStatus == true) {
			status = true;
		} else {
			status = false;	
		}
		return status;
	}

	
	/**
	 * returns the category
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * returns the current price of ticket
	 */
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Ride booked: " + getPurchaseStatus() + "\nThe category is. \n" + getCategory() 
				+ " and costs $" + getPrice();
	}
}
