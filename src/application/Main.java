package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		boolean access = false;
			
		while (access == false) {
			System.out.print("Enter the password: ");
			int password = scanner.nextInt();
			if (password == 2002) {
				System.out.println("Access allowed!");
				access = true;
			}
			else System.out.println("Invalid password!");
			System.out.println();
		}
		
		scanner.close();
		
	}

}
