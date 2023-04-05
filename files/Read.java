package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Read {

	public static void main(String[] args) {
		//define file path to read 
		String filename = "C:\\Users\\ibiro\\eclipse-workspace\\JavaTraining\\src\\readData.txt";
		String text ="";
		
		
		//Create the file in Java 
		File file = new File(filename);
		
		//Open the file
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			//read the file 
		text= br.readLine();
		
		//close the file
		br.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
			e.printStackTrace();
		}
		
		catch (IOException e) {
			System.out.println("ERROR: Could not read data: " + filename);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finished reading the file");
		}
		System.out.println(text);
		
	}

}
