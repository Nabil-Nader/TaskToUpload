
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mintuToYear(525949l );

	}
	
	/*
	 * Description:method take a Long number of Minutes to convert to years and days.
	 * Return:Void
	 */
	
	public static void mintuToYear(long mint) {
//		one day equal to 1440
 
		int oneDay = 24 * 60 ;
		
		long totalDays =   (mint/oneDay) ;
		// to get the year from totalDays
		int years = (int) (totalDays / 365);
		
		// we use the reminder to get the missing days
		int days = (int) (totalDays % 365) ;
		
		System.out.println("total days: "+totalDays+" equal:"+years+" year and "+days+" days");
		
	}

}
