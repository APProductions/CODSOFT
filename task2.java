package Tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class task2 {
	
	public static void filereader(String str) throws FileNotFoundException {
		int count =0;
		  File file = new File(str);
	      FileInputStream fis = new FileInputStream(file);
	      byte[] bytesArray = new byte[(int)file.length()];
	      try {
			fis.read(bytesArray);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	      String s = new String(bytesArray);
	      String [] data = s.split(" ");
	      for (int i=0; i<data.length; i++) {
	         count++;
	      }
	      System.out.println("Number of Words in the given file are " +count);
	   }
	public static void stringreader(String str) {
		
		int countWords= str.split("\\s").length+1;
		System.out.println("Number of words in the given string are "+countWords);
	}

	public static void main(String[] args) throws FileNotFoundException {
		      
		      Scanner sc=new Scanner(System.in);
		      System.out.println("Enter String or File path");
		      String str=sc.next();
		      if (isFilePath(str)) {
		    	  filereader(str);
		        } else {
		          stringreader(str);
		        
		        }
		    }

		    private static boolean isFilePath(String input) {
		        File file = new File(input);
		        return file.exists() && file.isFile();
		    }
		}