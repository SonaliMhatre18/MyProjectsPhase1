package com.locker.company;
import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	private void deleteFile() {
		Scanner scanner = new Scanner(System.in);
		String fileDirectory = "C:\\LockerFiles\\";
		System.out.println("Deleting files......");
		System.out.println("--------------------------------------------------");
		System.out.print("Enter name of a file you want to delete->");
		String deleteFile = scanner.nextLine();
		deleteFile.contentEquals(deleteFile);
		deleteFile = deleteFile + ".txt";
		File files = new File(fileDirectory + deleteFile);
		boolean ifFileFound = files.delete();

		if (ifFileFound) {
			System.out.println(deleteFile + "-> file is deleted.");
		} else {
			System.out.println(deleteFile + "-> file not found, file is not deleted.");
		}
	}

	public void display() {
		deleteFile();
	}

}
