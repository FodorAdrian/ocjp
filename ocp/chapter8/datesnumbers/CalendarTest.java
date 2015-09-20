import java.util.Date;
import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Date d1 = new Date(1_000_000_000_000L);
		System.out.println("1st date: " + d1);
		
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		
		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) {
			System.out.println("Sunday is the first day of the week");
		}
		System.out.println("trillionth milli day of week is "
			+ c.get(Calendar.DAY_OF_WEEK));
		c.add(Calendar.MONTH, 1);
		Date d2 = c.getTime();
		System.out.println("new date " + d2.toString());
		
		c.roll(Calendar.MONTH, 9);
		System.out.println("new calendar: " + c.getTime());
	}
}
