package filehandlingdemo;

import java.io.*;

public class filecreateread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// file creation
	 System.out.println("------------File Creation-----------");
     File file = new File("D:\\Java Programs\\file.txt");
     boolean present = file.exists();
     if(present == false) {
	      	try {
				boolean created = file.createNewFile();
				System.out.println("File is Created"+ created);
				
				// file writer == write anything in file
				FileWriter writer = new FileWriter(file, true); // true means (append) again and agai writing
				writer.write("\nHi How Are You!");
				writer.flush();
				writer.close();
				
				
				// File Reader == one you write the file you can print on console . so you can read a file.
				System.out.println("----------File Reading------------");
				FileReader fileread = new FileReader(file);
				int output = fileread.read();  // this function return integer so we can put on (int);
				while(output !=1) {
					System.out.print((char)output);
					output = fileread.read();   // again read the file
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	  }
     else {
    	 System.out.println("File is Already Exits");
     }
	
	}
}
