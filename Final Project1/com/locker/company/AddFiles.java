package com.locker.company;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

	public class AddFiles {
		private void addingFiles() {
			Scanner scanner = new Scanner(System.in);
			String fileDirectory = "C:\\LockerFiles\\";
			System.out.println("Adding files......");
			System.out.println("--------------------------------------------------");
			System.out.print("Enter name of a file you want to add->");
			String newFile = scanner.nextLine();
			newFile.equalsIgnoreCase(newFile);
			newFile = newFile + ".txt";
			File files = new File(fileDirectory + newFile);
			try {
				if (files.createNewFile()) {
					System.out.println(newFile + "-> New file is created.");
					System.out.println("--------------------------------------------------");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void display() {
			addingFiles();
		}

	}

