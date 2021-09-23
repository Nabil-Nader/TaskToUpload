
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class Main {

	public static final String DATE_FORMATE = "E dd MMM yyyy hh:mm:ss a z";
	public static final String MAIN_TIME = "Egypt";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//		 initialize LocalDatetime
		//		LocalDateTime f = LocalDateTime.now();

		//		DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_FORMATE);
		//		System.out.println(df);
		//		System.out.println(f.format(df));


		//		System.out.println(f);


		converDateTime("UTC");
		showeUtcDate();

	}

	/*
	 * Description: Method convert the  current timestamp to UTC DateTime.
	 * 
	 * Return:Void
	 */


	public static void showeUtcDate( ) {

		Date date = new Date();
		long time = date.getTime();
		System.out.println(time);

		Timestamp ts = new Timestamp(time);
		date = ts;

		System.out.println(date);

	}



	/*
	 * Description: Method convert time zone from EGY to UTC
	 * paramter:string zone=> target which time we want to display
	 * Return:void
	 */
	public static void converDateTime(String zone ) {
 		// we want a specific time format 		
		DateTimeFormatter df = DateTimeFormatter.ofPattern(DATE_FORMATE);
		// we pass string to get  Zone Id for specific time we want
		ZoneId fromTimeZone = ZoneId.of(MAIN_TIME);     
		ZoneId toTimeZone = ZoneId.of(zone);   
 
		//Current time
		LocalDateTime today = LocalDateTime.now();          

		//Zoned date time at source timezone
		ZonedDateTime mainTime = today.atZone(fromTimeZone);       

		//Zoned date time at target timezone
		ZonedDateTime currentUtcTime = mainTime.withZoneSameInstant(toTimeZone);

		//Format date time - optional
		System.out.println(df.format(mainTime));
		System.out.println(df.format(currentUtcTime));	

	}

}
