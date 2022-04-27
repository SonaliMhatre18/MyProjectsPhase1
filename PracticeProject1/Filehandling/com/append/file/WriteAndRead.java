package com.append.file;

import java.io.DataInput;
import java.io.FileWriter;
import java.io.FileReader;

public class WriteAndRead {

	public static void main(String[] args) {
		String data = "This is the data in the output file";
		char[] array = new char[60];
	    try {
	  
	      FileWriter output = new FileWriter("src/Append_File.txt");
	      output.write(data);
	      System.out.println("Data is written to the file.");
	      FileReader input = new FileReader("src/Append_File.txt");
	      input.read(array);
	      System.out.println("Reading Data");
	      System.out.println(array);
	      
          input.close();
	      output.close();
	    }
	    
	    catch (Exception e) 
	    {
	      e.getStackTrace();
	    }

	}

}