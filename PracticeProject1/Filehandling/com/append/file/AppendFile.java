package com.append.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {

	public static void main(String[] args) {
		try {
			String data = "Java append to file is a common java IO operation. For example, whenever we print something to server logs, it gets appended to the existing file.";
	        File f1 = new File("src/Append_File.txt");
	        if(!f1.exists()) {
	        	f1.createNewFile();
	        }
	        
	        FileWriter fileWriter = new FileWriter(f1.getName(),true);
	        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	        bufferedWriter.write(data);
	        bufferedWriter.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}