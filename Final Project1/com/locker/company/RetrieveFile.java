package com.locker.company;

import java.io.File;


public class RetrieveFile {

	private void retrieveFile() {
	    String fileDirectory = "C:\\LockerFiles\\";
		File files = new File(fileDirectory);
		int count = 1;
		String fileList[] = files.list();

		System.out.println("\nRetrieveing files from LockerFiles folder....");
		System.out.println("--------------------------------------------------");

		for (String name : fileList) {
			System.out.println(count + "." + name);
			count++;
		}

	}

	public void display() {
		retrieveFile();
	}

}