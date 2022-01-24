package Currencyconverter;

public class CurrencyConverter {
	public double DollarIndian(double dollar) {
		return dollar*74.36;
	}
	public double IndianDollar(double rupees) {
		return rupees/74.36;
	}
	public	double EuroIndian(double euro) {
		return euro*84.57;
	}
	public double IndianEuro(double rupees) {
		return rupees/84.57;
	}
	public double YentoIndian(double yen) {
		return yen*0.65;
	}
	public double IndiantoYen(double rupees) {
		return rupees/0.65;
	}
}
