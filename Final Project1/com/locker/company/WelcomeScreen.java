package com.locker.company;

import java.util.Scanner;

public class WelcomeScreen {
	private void selectChoice() {
		// Code for Welcome Screen
		Scanner scanner = new Scanner(System.in); // Scanner class
		System.out.println("Main Menu\n" + "1.Retrive files\n"
				+ "2.Businees level operation on files:-\n" + "  i.Add files\n" + "  ii.Delete files\n"
				+ "  iii.Search files\n" + "  iv.Go to Main Menu\n" + "3.Close application.\n");

		System.out.print("Enter your choice->");
		int choice = scanner.nextInt(); // Taking input from user

		// Switch statement
		switch (choice) {
		case 1:
			RetrieveFile retrieveFiles = new RetrieveFile();
			retrieveFiles.display(); // displaying retrieve files class
			System.out.println("\n");
			display(); // displaying welcome screen
			break;

		case 2:
			BusinessLevelOperation businessLevelOperation = new BusinessLevelOperation();
			businessLevelOperation.display(); // display add files, delete files, search files, main menu
			break;
		case 3:
			System.out.println("Thanks for using Locker Application");
			System.out.println("Closing your application..........");
			System.out.println("--------------------------------------------------");
			break;

		default:
			System.out.println("Please enter valid input.");
			break;
		}
	}

	public void display() {
		selectChoice();
	}
}