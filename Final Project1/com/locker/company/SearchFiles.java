package com.locker.company;

import java.io.File;
import java.util.Scanner;

public class SearchFiles {
	private void searchFiles() {
		Scanner scanner = new Scanner(System.in);
		String fileDirectory = "C:\\LockerFiles\\";
		System.out.println("Searching files......");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter name of a file you want to search->");
		String searchFile = scanner.nextLine();
		searchFile.contentEquals(searchFile);
		searchFile = searchFile + ".txt";
		File files = new File(fileDirectory + searchFile);
		boolean ifExists = files.exists();

		if (ifExists) {
			System.out.println(searchFile + "-> file found.");
		} else {
			System.out.println(searchFile + "-> file not found");
		}
	}

	public void display() {
		searchFiles();
	}

}
