// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			int a=0;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int i=1; i<=n;i++){
				int c=a+b;
				System.out.println(c);
				a=b;
				b=c;
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
