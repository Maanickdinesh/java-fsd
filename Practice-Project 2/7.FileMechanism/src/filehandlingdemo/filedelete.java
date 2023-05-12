package filehandlingdemo;
import java.io.*;
public class filedelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Java Programs\\file1.txt");
		boolean present=file.exists();
		System.out.println("File deleted sucessfully:  "+present); 
		}

	}


