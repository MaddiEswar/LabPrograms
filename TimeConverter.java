package TimeConverter;

public class TimeConverter {
	public double HourToMinute(double hour) {
		return 60*hour;
	}
	public double MinuteToHour(double min) {
		return min/60;
	}
	public double HourToSeconds(double hour) {
		return 3600*hour;
	}
	public double SecondsToHour(double sec) {
		return sec/3600;
	}
}
