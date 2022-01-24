import java.util.*;
class Invoice{

	private String number;
	private	String description;
	private int quantity;
	private double price;
	
	void setnumber(String number) {
		this.number=number;
	}
	
	void setdescription(String description) {
		this.description=description;
		}
	
	void setquantity(int quantity) {
		if(quantity>=0)
			this.quantity=quantity;
		else
			this.quantity=0;
		}
	
	void setprice(double pri) {
		if(pri>=0)
			this.price=pri;
		else
			this.price=0;
		}
	
	String getnumber() {
		return number;
	}
	
	String getdescription() {
		return description;
	}
	
	int getquantity() {
		return quantity;
	}
	
	double getprice() {
		return price;
	}
	
	double getInvoiceAmount() {
	    return (price*quantity);
	}
}
public class LabProgram1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Invoice v1=new Invoice();
		
		System.out.print("Enter the invoice number:");
		String invoi=sc.next();
		System.out.print("Enter the description:");
		String des=sc.next();
		System.out.print("Enter the quantity:");
		int quan=sc.nextInt();
		System.out.print("Enter the price per item:");
		double price=sc.nextDouble();
		v1.setnumber(invoi);
		v1.setdescription(des);
		v1.setquantity(quan);
		v1.setprice(price);
        System.out.println("The invoice amount:"+v1.getInvoiceAmount());
        sc.close();
	}

}

