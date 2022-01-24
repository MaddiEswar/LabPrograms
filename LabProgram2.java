import java.util.Scanner;
class Electricity{
	int consumer_number;
	String consumer_name;
	long previous_reading;
	long current_reading;
	String eb_connection;
	Electricity(int no, String name, long pr, long cr,String eb){
		 consumer_number=no;
		 consumer_name=name;
		 previous_reading=pr;
		 current_reading=cr;
		eb_connection=eb;
	}
	double rate() {
		double p;
		double c=current_reading-previous_reading;
		if(eb_connection.equals("domestic"))
		{
			if(c<=100)
				p= c;
			else if(c<=200)
				p= 1*(100)+(c-100)*2.50;
			else if(c<=500)
				p= 1*(100)+(100*2.50)+(c-200)*4;
			else
				p= (1*100)+(100*2.50)+(300*4)+((c-500)*6);
					
		}
		else
		{
			if(c<=100)
				p=c*2;
			else if(c<=200)
				p= (100*2)+((c-100)*4.50);
			else if(c<=500)
				p=(100*2)+(100*4.50)+((c-200)*6);
			else 
				p=(100*2)+(100*4.50)+(300*6)+((c-500)*7);
					
		}
		return p;
	}
	void show() {
		System.out.println("Consumer name:"+consumer_name);
		System.out.println("Consumer number:"+consumer_number);
		System.out.println("Previous month reading:"+previous_reading);
		System.out.println("Current month reading:"+current_reading);
	}
}
public class LabProgram2 {

	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Consumer number:");
        int number=sc.nextInt();
        System.out.print("Enter Consumer name:");
        String name=sc.next();
        System.out.print("Enter previous month reading:");
        long pr=sc.nextLong();
        System.out.print("Enter current month reading:");
        long cr=sc.nextLong();
        System.out.print("Enter connection type:");
        String eb=sc.next();
        Electricity e= new Electricity(number,name,pr,cr,eb);
        e.show();
        System.out.println("The amount to be paid:"+e.rate());
        sc.close();
	}

}

