public class Food {
	//private long id;
	private String category = new String();
	String subcat = new String();
	//private String description = new String();
	private double price;
	//private boolean inStock;
	
	/**
	 * @param id
	 * @param category
	 * @param description
	 * @param price
	 * @param inStock
	 */
	
	/**
     * Constructor method for the <b>Food</b> class. This constructor accepts no arguments and sets all values to <b>'null'</b>
     * and boolean values to <b>false</b>.
     */
	public Food(){
		
	}
	
	public Food(String category, String subcat, double price){
        if (category.equalsIgnoreCase("Snacks")) {
        	this.category = category;
        	if(subcat.equalsIgnoreCase("Potato Chips"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Samosas"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Chicken Sandwich"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Paneer Sandwich"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Biscuits"))	
        		this.subcat = subcat;
		} else if(category.equalsIgnoreCase("Sweets")) {
			this.category = category;
			if(subcat.equalsIgnoreCase("Chocolate"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Mithai"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Ice-cream"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Cake"))	
        		this.subcat = subcat;
		} else if(category.equalsIgnoreCase("Drinks")){
			this.category = category;
			if(subcat.equalsIgnoreCase("Coke"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Fanta"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Peppsi"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Buttermilk"))	
        		this.subcat = subcat;
        	if(subcat.equalsIgnoreCase("Mixed Fruit Juice"))	
        		this.subcat = subcat;
		}else{
			System.out.println("Invalid Food category. Please, talk to a member of staff.");
			this.category = "UNKNOWN";
		}
        
        this.price = price;
		/*this.description = description;
		this.id = id;
        
        this.inStock = inStock;*/
	}
	
	/**
	 * Used to set the price of the <b>Food</b> object to the value provided by <b>p</b>.
	 */
	/*public void setPrice(double p){
            this.price = p;
	}
		
	/**
	/*public void setInstock(boolean newStatus){
		this.inStock = newStatus;
	}
	
	public long getId(){
		return this.id;
	}*/
	
	/*
	
	public String getDescription(){
		return this.description;
	}*/
	
	
	// Used to get the unique category of the particular <b>Food</b> object.
	 
	public String getCategory(){
		return this.category;
	}
	
	// Used to get the unique sub category of the particular <b>Food</b> object.
	 
		public String getSubCategory(){
			return this.subcat;
		}
	
	/**
	 * method used to return the price of a <b>Food</b> object.
	 */
	public double getPrice(){
		return this.price;
	}
	
	/**
	 * method to check if a <b>Food</b> object remains in stock.
	 
	public boolean getInstock(){
		return this.inStock;
	}*/

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Food [category = " + getCategory() +  ", \n" 
				+" price = $" + getPrice() + "Chosen Dish/Snack = " + getSubCategory() + "]";
	}
	
}