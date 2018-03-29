import java.util.List;

public class Bill {	
	
	String name;
	float price;
	public void generateBill(List<Customer> c) {
		// TODO Auto-generated method stub
		
	}

	public void header(String name) {
		// TODO Auto-generated method stub
		this.name=name;
		System.out.println("-------------------------------------------------");
		System.out.println("|           "+this.name+"                 |");
		System.out.println("-------------------------------------------------");


	}

	public void Sub_Header() {
		// TODO Auto-generated method stub
		
		System.out.println("|      Name   |     Price     |     Quantity    |");
		System.out.println("-------------------------------------------------");
		
	}

	public void GrandTotal(float price) {
		// TODO Auto-generated method stub
		this.price = price;
		System.out.println("|                  Grand Total    "+this.price+"        |");
		System.out.println("-------------------------------------------------");
		
	}

	

}
