package DistanceConverter;

public class DistanceConverter {
	public double MetertoKm(double meter) {
		return meter/1000;
	}
	public double KmToMeter(double km) {
		return km*1000;
	}
	public double MilesToKm(double miles) {
		return miles*1.609;
	}
	public double KmToMiles(double km) {
		return km/1.609;
	}
}
