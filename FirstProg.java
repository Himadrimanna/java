//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class FirstProg {
	 public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)){
			System.out.println("Enter a number:");
         	 int n= sc.nextInt();
			if (n%2==0){
				System.out.println("The number is Even");
			}else{
				System.out.println("The number is odd");
			}
		 }
		}
	}
