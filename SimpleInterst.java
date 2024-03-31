import java.util.Scanner;

public class SimpleInterst {
	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)) {
			System.out.println("Welcome to your Interst calculator");
			System.out.println("Enter your Principle Amount :");
			long p = sc.nextLong() ;
			System.out.println("Enter the Rate of Interset :");
			int r =sc.nextInt();
			System.out.println("Enter the year of Interst :");
			int y = sc.nextInt();

			long s = (p*r*y)/100;
			System.out.println("Your Total Interst have to pay Rs"+" "+s);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
