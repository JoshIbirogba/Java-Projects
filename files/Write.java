package files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		//Define path to write
		String filename = "C:\\Users\\ibiro\\eclipse-workspace\\JavaTraining\\src\\fileWrite.txt";
		String message = "Write this message to a file";
		
		//create the file path
		File file = new File(filename);
		
		try {
		//Open file 
		FileWriter fileWrite = new FileWriter(file);
		
		//Write to file 
		fileWrite.write(message);
		
		//Close the file
        fileWrite.close();
		}
		catch (IOException e) {
			System.out.println("ERROR: Could not read the file" + filename);
			e.printStackTrace();
		}finally
		{
			System.out.println("Closing the file writer.................................");
		}

	}

}
