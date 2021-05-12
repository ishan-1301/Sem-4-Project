import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AmusementParkTester {
	
	SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
	private static long number;
	private static int incorrectcount = 0;
    private static String category = new String();
    private static String holder = new String();
    private static Date date = new Date();
    private static double price;
    private static boolean purchaseStatus;
    private static ArrayList<Ticket> TicketList = new ArrayList<Ticket>();
    private static ArrayList<Food> FoodList = new ArrayList<Food>();

	//ArrayList<Integer> slotcount = new ArrayList<>(8);
	static int slotcount[][] = new int[8][8];
	//int timecount[] = new int[6];
	static String timings[][] = new String[8][8];
	//static int snackcount[] = new int[5];
	static int[] snackcount = {100,100,100,100,100};
	//static int sweetcount[] = new int[4];
	static int[] sweetcount = {100,100,100,100};
	//static int drinkcount[] = new int[5];
	static int[] drinkcount = {100,100,100,100,100};


	
	public static Date createDay(){
		Date d = new Date();
		return d;
	}
	
	public static int TicketIDBrowse(long t) {
		//TicketList = new ArrayList<Ticket>();
		int f=0;
	    for(Ticket str: TicketList){
        	if(str.number == t) 
        		f++;
	    }
	    return f;
	}
	
	public static void runPark(AmusementPark p){/*
		int t;
		for(int i=0; i < 8; i++) {
			t = 9;
			for(int j=0; j < 8 ; j++) {
				timings[i][j] = Integer.toString(t) + ":00 ";
				slotcount[i][j] = 8;
				t++;}
			}
		
		for(int i=0; i < 8; i++) {
			for(int j=0; j < 8 ; j++) 
				System.out.print(timings[i][j]+ " ");
			System.out.println();}
		System.out.println("Welcome to " + p.getName() + "!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String answer = new String(), d2;
		int customerChoice;
		char ticket;
		System.out.println("Do you have a ticket? y/n");
		ticket = input.next().charAt(0);
		do{
			if(ticket == 'n') {
				System.out.println("Enter name: - ");
				holder = input.next();
				System.out.println("Enter ID: - ");
				number = input.nextLong();
				System.out.println("Enter Balance: - ");
				price = input.nextDouble();
				System.out.println("Enter Age Category: - ");
				category = input.nextLine();
				System.out.println("Enter Date: - ");
				d2 = input.nextLine();
				date = new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
				purchaseStatus = true;
				Ticket t1 = new Ticket(number, category, holder, date, price, purchaseStatus);
		    	newPark.addTicket(t1);
				ticketTransaction(p);
				System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
				answer = input.next();}
			else {
				System.out.println("Enter '1' to buy a Ticket.");
				System.out.println("Enter '2' to buy Merchandise.");
				System.out.println("Enter '3' to book a Ride.");
				System.out.println("Enter '4' to buy Food.");
				System.out.println("Enter '0' to exit.");
				customerChoice = input.nextInt();
				try {
					switch (customerChoice){
					case 1:
						ticketTransaction(p);
						System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
						answer = input.next();
						break;
					case 2:
						merchandiseTransaction(p);
						System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
						answer = input.next();
						break;
					case 3:
						RideManagement(p);
						System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
						answer = input.next();
						break;
				w	case 0:
						System.out.println("Thank you for shopping with us.");
						System.exit(0);
						
	//				default:
	//					
	//					break;
					}
				} catch (InputMismatchException e) {
					System.out.println("Please, enter a valid number.");
					runPark(p);
					break;
				}
			}
		}while(answer.equalsIgnoreCase("y"));
		System.out.println("Thank you for shopping with us.");*/
	}
	
	public static void ticketTransaction(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available ticket dates. \nPlease, enter a ticket ID.");
		p.getTicketDates();
		int choice;
		choice = input.nextInt();
		try {
			p.buyTicket(choice);
		} catch (Exception e) {
			System.out.println("Ticket ID not found!");
		}
	}
	
	public static void RideManagement(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available rides . Enter:");
		System.out.println("1.	Ferris Wheel \n2.	Rollercoaster \n3.	Haunted Housel \n4.	Merry Go Round \n5.	Dodgems \n6.	Water Ride");
		
		int choice, f = 0;
		String time = "";
		choice = input.nextInt();
		String answer = new String();
		
		try {
			switch (choice){
				case 1:
					//p.getRide("Ferris Wheel");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
						
						*/
						System.out.println("Here are the available times for this ride.");
						for(int i=0; i < 8; i++) 
							System.out.print(timings[choice][i]+"\t");
						System.out.println("Choose Timing: ");
						time = input.next();
						//System.out.println(time);
						f=0;
						
						for(int i=0; i < 8; i++) { 
							if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
								f=1;
								if(slotcount[choice-1][i] == 1)
									timings[choice-1][i] = "";
								slotcount[choice-1][i]--;
								//System.out.println("Booking for Time : " +time+ " Successful");
							}
							//System.out.println(timings[choice-1][i]);
						}
						if(f == 1)
							System.out.println("Booking for Time : " +time+ " Successful");
						else
							System.out.println("Slot Unavailable");
					}
				break;
				
				case 2:
					//p.getRide("Sweatshirt");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}*/
						System.out.println("Here are the available times for this ride.");
						for(int i=0; i < 8; i++) 
							System.out.print(timings[choice][i]+"\t");
						System.out.println("Choose Timing: ");
						time = input.next();
						//System.out.println(time);
						f=0;
						
						for(int i=0; i < 8; i++) { 
							if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
								f=1;
								if(slotcount[choice-1][i] == 1)
									timings[choice-1][i] = "";
								slotcount[choice-1][i]--;
								System.out.println("Booking for Time : " +time+ " Successful");
								//System.out.println(timings[choice-1][i]);
							}
						}
							if(f == 1)
								System.out.println("Booking for Time : " +time+ " Successful");
							else
								System.out.println("Slot Unavailable");					
						}
				break;
				
				case 3:
					p.getRide("Haunted House");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}*/
						System.out.println("Here are the available times for this ride.");
						for(int i=0; i < 8; i++) 
							System.out.print(timings[choice][i]+"\t");
						System.out.println("Choose Timing: ");
						time = input.next();
						//System.out.println(time);
						f=0;
						
						for(int i=0; i < 8; i++) { 
							if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
								f=1;
								if(slotcount[choice-1][i] == 1)
									timings[choice-1][i] = "";
								slotcount[choice-1][i]--;
								System.out.println("Booking for Time : " +time+ " Successful");
							}
							//System.out.println(timings[choice-1][i]);
						}
						if(f == 1)
							System.out.println("Booking for Time : " +time+ " Successful");
						else
							System.out.println("Slot Unavailable");
					}
				break;
				
				case 4:
					//System.out.println("Here are the available merchandise for this category.");
					p.getRide("Merry Go Round");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}*/
					System.out.println("Here are the available times for this ride.");
					for(int i=0; i < 8; i++) 
						System.out.print(timings[choice][i]+"\t");
					System.out.println("Choose Timing: ");
					time = input.next();
					//System.out.println(time);
					f=0;
					
					for(int i=0; i < 8; i++) { 
						if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
							f=1;
							if(slotcount[choice-1][i] == 1)
								timings[choice-1][i] = "";
							slotcount[choice-1][i]--;
							//System.out.println("Booking for Time : " +time+ " Successful");
						}
						//System.out.println(timings[choice-1][i]);
					}
					if(f == 1)
						System.out.println("Booking for Time : " +time+ " Successful");
					else
						System.out.println("Slot Unavailable");
				}
				break;
				
				case 5:
					p.getRide("Dodgems");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
					System.out.println("Here are the available times for this ride.");
					for(int i=0; i < 8; i++) 
						System.out.print(timings[choice][i]+"\t");
					System.out.println("Choose Timing: ");
					time = input.next();
					//System.out.println(time);
					f=0;
					
					for(int i=0; i < 8; i++) { 
						if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
							f=1;
							if(slotcount[choice-1][i] == 1)
								timings[choice-1][i] = "";
							slotcount[choice-1][i]--;
							//System.out.println("Booking for Time : " +time+ " Successful");
						}
						//System.out.println(timings[choice-1][i]);
					}
					if(f == 1)
						System.out.println("Booking for Time : " +time+ " Successful");
					else
						System.out.println("Slot Unavailable");
				}	

				break;
				
				case 6:
					p.getRide("Water Ride");
					System.out.println("Do you wish to book the ride? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						/*System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
					System.out.println("Here are the available times for this ride.");
					for(int i=0; i < 8; i++) 
						System.out.print(timings[choice][i]+"\t");
					System.out.println("Choose Timing: ");
					time = input.next();
					//System.out.println(time);
					f=0;
					
					for(int i=0; i < 8; i++) { 
						if(time.charAt(0) ==  timings[choice-1][i].charAt(0) && time.charAt(0) ==  timings[choice-1][i].charAt(0) && slotcount[choice-1][i]!=0) {
							f=1;
							if(slotcount[choice-1][i] == 1)
								timings[choice-1][i] = "";
							slotcount[choice-1][i]--;
							//System.out.println("Booking for Time : " +time+ " Successful");
						}
						//System.out.println(timings[choice-1][i]);
					}
					if(f == 1)
						System.out.println("Booking for Time : " +time+ " Successful");
					else
						System.out.println("Slot Unavailable");
				}	
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid option.");
		}	
	}
	
	public static void FoodTransaction(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available merchandise items. Enter:");
		System.out.println("1 for Snacks \n2 for Drinks \n3 for Sweets");
		
		int choice , subch , f = 0;
		double cost = 0.0;
		choice = input.nextInt();
		String answer = new String();
		String sn = "" , mc = "";
		
		try {
			switch (choice){
				case 1:
					System.out.println("Here are the available snacks for this category.");
					System.out.println("1 for Potato Chips \n2 for Samosas \n3 for Chicken Sandwich \n4 for Paneer Sandwich \n5 for Biscuits");
					subch = input.nextInt();
					//p.getFood("Snacks");
					mc = "Snacks";
					sn = input.next();
					//p.getSubFood("Potato Chips");
					if(sn == "1")
						sn = "Potato Chips";
					if(sn == "2")
						sn = "Mithai";
					if(sn == "3")
						sn = "Ice-cream";
					if(sn == "4")
						sn = "Cake";
					if(sn == "5")
						sn = "Cake";
					FoodList.add(new Food(mc, sn, cost));
						for(Food ft: FoodList){
			        	if(ft.subcat == sn) 
			        		System.out.println(ft.subcat + " ");//f++;
				    }
					if(f == 1)
						System.out.println(sn+ " order Successful");
					else
						System.out.println("Chosen Option Unavailable");
					//p.get
					/*System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
				break;
				
				case 2:
					System.out.println("Here are the available merchandise for this category.");
					System.out.println("1 for Chocolate \n2 for Mithai \n3 for Ice-cream \n4 for Cake");
					p.getMerchandise("Sweets");
					sn = input.next();
					if(sn == "1")
						sn = "Chocolate";
					if(sn == "2")
						sn = "Mithai";
					if(sn == "3")
						sn = "Ice-cream";
					if(sn == "4")
						sn = "Cake";
					for(Food ft: FoodList){
			        	if(ft.subcat == sn) 
			        		f++;
				    }
					if(f == 1)
						System.out.println(sn+ " order Successful");
					else
						System.out.println("Slot Unavailable");
					/*System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
				break;
				
				case 3:
					System.out.println("Here are the available foods for this category.");
					System.out.println("1 for Coke \n2 for Fanta \n3 for Peppsi \n4 for Buttermilk \n5 for Mixed Fruit Juice");
					p.getMerchandise("Drinks");
					sn = input.next();
					if(sn == "1")
						sn = "Coke";
					if(sn == "2")
						sn = "Fanta";
					if(sn == "3")
						sn = "Peppsi";
					if(sn == "4")
						sn = "Buttermilk";
					if(sn == "5")
						sn = "Mixed Fruit Juice";
					for(Food ft: FoodList){
			        	if(ft.subcat == sn) 
			        		f++;
				    }
					if(f == 1)
						System.out.println(sn+ " order Successful");
					else
						System.out.println("Slot Unavailable");
					/*System.out.println("Do you wish to buy a ticket? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
						System.out.println("Transaction successful.");
					}*/
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid option.");
		}	
	}
	
	public static void merchandiseTransaction(AmusementPark p){
		Scanner input = new Scanner(System.in);
		System.out.println("Here are the available merchandise items. Enter:");
		System.out.println("1 for T-shirt \n2 for sweatshirt \n3 for stuffed animal \n4 for jeans");
		
		int choice;
		choice = input.nextInt();
		String answer = new String();
		
		try {
			switch (choice){
				case 1:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("T-Shirt");
					/*System.out.println("Do you wish to buy it? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
				break;
				
				case 2:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Sweatshirt");
					/*System.out.println("Do you wish to buy it? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
				break;
				
				case 3:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Stuffed Animal");
					/*System.out.println("Do you wish to buy it? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/
				break;
				
				case 4:
					System.out.println("Here are the available merchandise for this category.");
					p.getMerchandise("Jeans");
					/*System.out.println("Do you wish to buy it? Enter 'y' or 'n'.");
					answer = input.next();
					if (answer.equalsIgnoreCase("y")) {
						System.out.println("Enter ticket ID.");
						try {
							long id = input.nextLong();
							p.buyMerchandise(id);
						} catch (Exception e) {
							System.out.println("Invalid ID. Please, try again.");
						}
					}*/  
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid option.");
		}	
	}
	
	public static void main(String args[]) throws ParseException{
		AmusementPark newPark = new AmusementPark("Walden Amusement Park");
    	/*Ticket t1 = new Ticket(1011L, "child", "John Doe", AmusementParkTester.createDay(), 34.56, false);
    	newPark.addTicket(t1);
    	Ticket t2 = new Ticket(1022L, "senior", "Neo Anderson", AmusementParkTester.createDay(), 50.99, false);
    	newPark.addTicket(t2);
    	Ticket t3 = new Ticket(1033L, "child", "Morpheus Fishburne", AmusementParkTester.createDay(), 34.56, false);
    	newPark.addTicket(t3);
    	Ticket t4 = new Ticket(1044L, "senior", "Alexis Sanchez", AmusementParkTester.createDay(), 50.99, false);
    	newPark.addTicket(t4);
    	Ticket t5 = new Ticket(1055L, "adult", "Jack Sparrow", AmusementParkTester.createDay(), 100.94, false);
    	newPark.addTicket(t5);
    	
        Merchandise m1 = new Merchandise(1111L, "T-shirt", "apparel", 3.99, true);
        newPark.addMerchandise(m1);
        Merchandise m2 = new Merchandise(1122L, "Sweatshirt", "apparel", 21.54, true);
        newPark.addMerchandise(m2);
        Merchandise m3 = new Merchandise(1133L, "Jeans", "apparel", 50.73, true);
        newPark.addMerchandise(m3);
        Merchandise m4 = new Merchandise(1144L, "T-shirt", "apparel", 6.99, true);
        newPark.addMerchandise(m4);
        Merchandise m5 = new Merchandise(1155L, "Stuffed Animal", "Elmo doll", 200.14, true);
        newPark.addMerchandise(m5);
        Merchandise m6 = new Merchandise(1166L, "Jeans", "apparel", 1000.00, true);
        newPark.addMerchandise(m6);*/
		int t,tc = 0;
		for(int i=0; i < 8; i++) {
			t = 9;
			for(int j=0; j < 8 ; j++) {
				timings[i][j] = Integer.toString(t) + ":00 ";
				slotcount[i][j] = 8;
				t++;}
			}
		
		/*for(int i=0; i < 8; i++) {
			for(int j=0; j < 8 ; j++) 
				System.out.print(timings[i][j]+ " ");
			System.out.println();}*/
		System.out.println("Welcome to " + newPark.getName() + "!");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String answer = "y", d2 = "" ;
		int customerChoice , ticketcount = 0;
		char ticket;
		Ticket[] t1;
		t1 = new Ticket[100];//100 being max park customer limit
		//= new Ticket();
		System.out.println("Do you have a ticket? y/n");
		ticket = input.next().charAt(0);
		do{
			if(ticket == 'n') {
				System.out.println("Enter name: - ");
				holder = input.next();
				System.out.println("Enter ID: - ");
				number = input.nextLong();
				System.out.println("Enter Balance: - ");
				price = input.nextDouble();
				System.out.println("Enter Age Category: - ");
				category = input.next();
				System.out.println("Enter Date: - ");
				d2 = input.next();
				date = new SimpleDateFormat("dd/MM/yyyy").parse(d2); 
				purchaseStatus = true;
				//t1[ticketcount] = new Ticket(number, category, holder, date, price, purchaseStatus);
				//TicketList.add(t1[ticketcount++]);
				TicketList.add(new Ticket(number, category, holder, date, price, purchaseStatus));
		    	//newPark.addTicket(t1[ticketcount++]);
				//ticketTransaction(newPark);
				for(Ticket str: TicketList)
					System.out.println(str.number);
				System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
				answer = input.next();
				ticket = 'y';}
			else if (incorrectcount < 4){ //Effectively 4 attempts to login 
				System.out.println("Enter Ticket ID - ");
				long tid = input.nextLong();
				int id = TicketIDBrowse(tid);
				if(id == 0) {
					System.out.println("Given ID invalid / unavailable");
					incorrectcount++;
				}
				else {
					System.out.println("Enter '1' to buy a Ticket.");
					System.out.println("Enter '2' to buy Merchandise.");
					System.out.println("Enter '3' to book a Ride.");
					System.out.println("Enter '4' to buy Food.");
					System.out.println("Enter '0' to exit.");
					customerChoice = input.nextInt();
					try {
						switch (customerChoice){
						case 1:
							ticketTransaction(newPark);
							//System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
							answer = input.next();
							break;
						case 2:
							merchandiseTransaction(newPark);
							//System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
							//answer = input.next();
							break;
						case 3:
							RideManagement(newPark);
							//System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
							//answer = input.next();
							break;
						case 4:
							FoodTransaction(newPark);
							//System.out.println("Do you wish to continue? Enter 'y' or 'n'.");
							//answer = input.next();
							break;	
						case 0:
							System.out.println("Thank you for shopping with us.");
							System.exit(0);
							
		//				default:
		//					
		//					break;
						}
					} catch (InputMismatchException e) {
						System.out.println("Please, enter a valid number.");
					//runPark(newPark);
					break;
					}
				}
				System.out.println("Do you wish to continue ? y/n");
				answer = input.next();
			}
			else {
				System.out.println("Too many invalid ID attempts, Please try again later");
				answer = "n";
			}
		}while(answer.equalsIgnoreCase("y"));
		System.out.println("Thank you for shopping with us.");
        runPark(newPark);
        
	}	
}
    