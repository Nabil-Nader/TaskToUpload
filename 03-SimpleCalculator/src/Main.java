import java.util.Scanner;

public class Main {

	public static final Scanner scann = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Entet a number:");
		int n1 = scann.nextInt();

		System.out.print("Entet a second  number:");
		int n2 = scann.nextInt();

		preformCalculation(n1,n2);

	}

	/*  
	 * Description: Method perform simple calculation
	 * return:void
	 */
	public static void preformCalculation(int num1 , int num2) {
		int sum = num1 + num2 ;
		int difference = num1 - num2;
		int product = num1 * num2 ;
		double avg = (double)sum / 2;
		int distance = num1 - num2 ;
		System.out.print("the Sum of the Two numbe:");
		System.out.println(num1+" + "+num2 +" = "+sum);

		System.out.print("the difference of the Two numbe:");
		System.out.println(num1+" - "+num2 +" = "+difference);
 
		System.out.print("the product of the Two numbe:");
		System.out.println(num1+" * "+num2 +" = "+product);

		if(num2== 0) {
			System.out.println("Can not divide by Zero");
		}else {
			double division = (double) num1/num2;
			System.out.print("the division of the Two numbe:");
			System.out.println(num1+" / "+num2 +" = "+division);
		}

		System.out.print("the average of the Two numbe:");
		System.out.println("("+num1+" + "+num2 +") / 2 = "+avg);

		//		the get the the distance (the difference between integer)

		//		we subtract num1 from num2, if num2 was high we just multiply by -1
		if(distance>0) {
			System.out.print("the distance of the Two numbe:");
			System.out.println(num1+" - "+num2 +" = "+distance);

		}else {
			distance *=-1;
			System.out.print("the distance of the Two numbe:");
			System.out.println(num1+" - "+num2 +" = "+distance);

		}

		// to get the max and min
		if(num1> num2) {
			System.out.println("Num1 is the max:"+num1);
			System.out.println("Num2 is the mim:"+num2);
		}else {
			System.out.println("Num2 is the max:"+num2);
			System.out.println("Num1 is the mim:"+num1);
		}


	}

}
