package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("What year?");
		int n1 = in.nextInt();
		boolean condition = (n1 % 4 < 1) && (n1 % 100 > 0) || (n1 % 400 < 1);
		System.out.print(n1 + " is a leap year: " + condition);
	}

}
