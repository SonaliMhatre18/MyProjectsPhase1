package com.locker.company;

import java.io.File;
import java.util.Scanner;

public class BusinessLevelOperation {
	private void businessLevelOperation() {
		String fileDirectory = "C:\\LockerFiles\\";
		File files = new File(fileDirectory);
		System.out.println("\n1.Add Files\n" + "2.Delete Files\n" + "3.Search Files\n" + "4.Main Menu\n");
		System.out.print("Enter your choice->");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			AddFiles addFiles = new AddFiles();
			addFiles.display(); // displaying add file class
			display(); // displaying business level operation class
			break;

		case 2:
			DeleteFile deleteFile = new DeleteFile();
			deleteFile.display(); // displaying delete file class
			display(); // displaying business level operation class
			break;

		case 3:
			SearchFiles searchFile = new SearchFiles();
			searchFile.display(); // displaying search file class
			display(); // displaying business level operation class
			break;

		case 4:
			WelcomeScreen welcomeScreen = new WelcomeScreen();
			welcomeScreen.display(); // displaying main menu
			break;

		default:
			System.out.println("Please enter valid input.");
			break;
		}
	}

	public void display() {
		businessLevelOperation();
	}

}