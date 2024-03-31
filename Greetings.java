import java.util.Scanner;

public class Greetings {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your name please:");
			String a = sc.nextLine();
			System.out.println("Hello"+" "+a+" "+"greetings from Himadri Manna");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
