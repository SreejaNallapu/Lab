package lab_2;
import java.util.Calendar;
public class Currentdate_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Calendar ca = Calendar.getInstance();
	        ca.set(2025, Calendar.AUGUST,5);
	        System.out.println("date using Calendar: "+ca.getTime());
	  }

	}
