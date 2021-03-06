import Currencyconverter.*;
import DistanceConverter.*;
import TimeConverter.*;
import java.util.Scanner;
public class LabProgram10 {
	public static void main(String[] args) {
		CurrencyConverter c= new CurrencyConverter(); 
		DistanceConverter d=new DistanceConverter();
		TimeConverter t=new TimeConverter();
		Scanner sc =new Scanner(System.in);
		System.out.println("\tConversions Menu");
		System.out.println("1.Currency Converter");
		System.out.println("2.DistanceConverter");
		System.out.println("3.Time Converter");
		System.out.print("Enter your choice:");
		int choice1=sc.nextInt();
		switch(choice1) {
		case 1: System.out.println("1.DOLLAR TO INR");
				System.out.println("2.INR TO DOLLAR");
				System.out.println("3.EURO TO INR");
				System.out.println("4.INR TO EURO");
				System.out.println("5.YEN TO INR");
				System.out.println("6.INR TO YEN");
				System.out.print("Enter your choice:");
				int choice2=sc.nextInt();
				switch(choice2) {
					case 1:System.out.println("Enter money in dollars:");
							double m=sc.nextDouble();
							System.out.println("IN INR:"+c.DollarIndian(m));
							break;
					case 2:System.out.println("Enter money in INR:");
							double k=sc.nextDouble();
							System.out.println("IN DOLLARS:"+c.IndianDollar(k));
							break;
					case 3:System.out.println("Enter money in EURO:");
							double e=sc.nextDouble();
							System.out.println("IN INR:"+c.EuroIndian(e));
							break;
					case 4:System.out.println("Enter money in INR:");
							double i=sc.nextDouble();
							System.out.println("IN EURO:"+c.IndianEuro(i));
							break;
					case 5:System.out.println("Enter money in YEN:");
							double y=sc.nextDouble();
							System.out.println("IN INR:"+c.YentoIndian(y));
							break;
					case 6:System.out.println("Enter money in INR:");
							double q=sc.nextDouble();
							System.out.println("IN YEN:"+c.IndiantoYen(q));
							break;
				}
				break;
		case 2: System.out.println("1.MeterTo KM");
				System.out.println("2.KM to Meters");
				System.out.println("3.Miles To KM");
				System.out.println("4.KM to Miles");
				System.out.print("Enter your choice:");
				int choice3=sc.nextInt();
				switch(choice3) {
					case 1: System.out.println("Enter distance in METERS:");
							double d1=sc.nextDouble();
							System.out.println("IN KILOMETERS:"+d.MetertoKm(d1));
							break;
					case 2: System.out.println("Enter distance in KILOMETERS:");
							double d2=sc.nextDouble();
							System.out.println("IN METERS:"+d.KmToMeter(d2));
							break;
					case 3: System.out.println("Enter distance in MILES:");
							double d3=sc.nextDouble();
							System.out.println("IN KILOMETERS:"+d.MilesToKm(d3));
							break;
					case 4: System.out.println("Enter distance in KILOMETERS:");
							double d4=sc.nextDouble();
							System.out.println("IN MILES:"+d.KmToMiles(d4));
							break;
				}
				break;
		case 3: System.out.println("1.HOUR TO MINUTE");
				System.out.println("2.MINUTE TO HOUR");
				System.out.println("3.HOUR TO SECONDS");
				System.out.println("4.SECONDS TO HOUR");
				System.out.print("Enter your choice:");
				int choice4=sc.nextInt();
				switch(choice4){
				case 1:  System.out.println("Enter time in HOURS:");
						double t1=sc.nextDouble();
						System.out.println("IN MINUTES:"+t.HourToMinute(t1));
						break;
				case 2: System.out.println("Enter time in MINUTES:");
						double t2=sc.nextDouble();
						System.out.println("IN HOURS:"+t.MinuteToHour(t2));
						break;
				case 3:System.out.println("Enter time in HOURS:");
						double t3=sc.nextDouble();
						System.out.println("IN SECONDS:"+t.HourToSeconds(t3));
						break;
				case 4:System.out.println("Enter time in SECONDS:");
						double t4=sc.nextDouble();
						System.out.println("IN HOUR:"+t.SecondsToHour(t4));
						break;
				}
				break;
		}
		sc.close();
	}
}