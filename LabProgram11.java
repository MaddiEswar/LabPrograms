import java.util.*;
public class LabProgram11 {
	public static void main(String[] args) {
		try{
			int x=2/0;
		}
		catch(ArithmeticException e){
			System.out.println("ArithmeticException : "+e);
		}
		try{		
			int n;
			System.out.print("Enter an integer value :");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			System.out.print("Entered value:"+n);
			sc.close();
		}
		catch(InputMismatchException e){
			System.out.println("Input mismatch :"+e);
		}		
	}
}
