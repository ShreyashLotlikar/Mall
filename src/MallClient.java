import java.util.*;

public class MallClient {

	public static void main(String[] args) {
		
		List<Item>I = new ArrayList<Item>();
		
		Item[] ItemPresent = new Item[5];
		//List of Items Present in mall
		ItemPresent[0] = new Item("Pen",10);
		ItemPresent[1] = new Item("Cel",15);
		ItemPresent[2] = new Item("Can",99);
		ItemPresent[3] = new Item("Ball",30);
		ItemPresent[4] = new Item("Bat",900);

		//Customer Buys Products
		//Assuming Customer Buys 3 Products
		List<Customer> C = new ArrayList<Customer>();
		Customer[] newCust = new Customer[4];
		
		//List of items purchased by customer
		newCust[0] = new Customer(ItemPresent[0],1);
		newCust[1] = new Customer(ItemPresent[1],1);
		newCust[2] = new Customer(ItemPresent[2],1);
		
		//Added to the List
		for(int i=0;i<4;i++)
			C.add(newCust[i]); 
		
		Bill Cust_Bill = new Bill();
		//Generate Header For Bill
		Cust_Bill.header("Navya Shopping Mall");
		Cust_Bill.Sub_Header();
		
		Iterator<Customer> it = C.iterator();
		while (it.hasNext())
		 {			
			 Customer C1 = (Customer)it.next();
			 if(C1==null)
				 break;
			 displayDetails(C1);//Used to display items in the Bill
		 }
		
		//Calculates The bill
		 float price = CalculateBill(newCust);
		 //Geneartes Footer for the Bill i.e Grand Total
		 Cust_Bill.GrandTotal(price);		
	}

	private static float CalculateBill(Customer[] newCust) {
		
		float tax=0,total=0,price=0;
		int i;
		for(i=0;i<3;i++)
			total = total + ((newCust[i].getItem().price) * (newCust[i].getQuantity()));
		
		tax = 12 * (total/100);
		price = total + tax;
		//System.out.println("TOTAL PRICE :"+price);

		return price;
	}

	private static void displayDetails(Customer c1) {
		// TODO Auto-generated method stub
		System.out.println("|      "+c1.getItem().name+"    |     "+c1.getItem().price+"        |     "+c1.getQuantity()+"           |");
		System.out.println("-------------------------------------------------");
		//System.out.println("Name :"+c1.getItem().name);
		///System.out.println("Price :"+c1.getItem().price);
		//System.out.println("Quantity :"+c1.getQuantity());


	}
}
