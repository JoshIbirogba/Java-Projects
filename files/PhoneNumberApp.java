package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This code will read a text file and retrieve phone numbers
		//Numbers must be valid
		//Area code cannot start with 0 or 9
		//there cannot be a 911 sequence in the number
		
		//Create the file path 
		String filename = "C:\\Users\\ibiro\\eclipse-workspace\\JavaTraining\\src\\PhoneNumber.txt";
		
		// Create an array to store the phone numbers
		String[] phoneNumbers = new String[10];
		
		// This variable will be used to store the current phone number being validated
		String phoneNumber = null;
		
		// Create a file object with the file path
		File file = new File(filename);
		
		try {
			// Create a BufferedReader to read the file
			BufferedReader br = new BufferedReader(new FileReader (file));
			
			// Loop through each line of the file and add it to the phoneNumbers array
			for (int i = 0; i < phoneNumbers.length; i++) {
			phoneNumbers[i] = br.readLine();
			}
			//close the file
			br.close();
			
		} catch (FileNotFoundException e) {
			// Handle the exception when the file is not found
			System.out.println("ERROR: FILE NOT FOUND............");
			e.printStackTrace();
			
		}catch (IOException e){
			// Handle the exception when the file cannot be read
			System.out.println("ERROR: File cannot be read");
			e.printStackTrace();
		}
		
		// Check each phone number in the array for validity
		for (int x = 0; x < phoneNumbers.length; x++) {
			phoneNumber = phoneNumbers[x];
		try {
			// Check that the phone number is exactly 10 digits long
			if (phoneNumber.length() != 10) {
				throw new TenDigitsException(phoneNumber);
			}
			// Check that the area code does not start with 0 or 9
			if ((phoneNumber.substring(0, 1).contentEquals("0")) || (phoneNumber.substring(0, 1).equals("9"))) {
				throw new AreaCodeException(phoneNumber);
			}
			// Check that there is no 911 sequence in the phone number
			for (int i = 0; i < phoneNumber.length() - 2; i++) {
				if ((phoneNumber.substring(i, i + 1).equals("9")) && (phoneNumber.substring(i + 1, i + 3).equals("11"))) {
				throw new Exception(phoneNumber);
			}
			}
			System.out.println("The phone number in the directory is " + phoneNumber);
		}
		
		catch (TenDigitsException e) {
			// Handle the exception when the phone number is not exactly 10 digits
			System.out.println("ERROR: Phone number is not 10 digits");
			System.out.println(e.toString());
		}
		catch (AreaCodeException e) {
			// Handle the exception when the area code starts with 0 or 9
			System.out.println("ERROR: Area code is incorrect");
			System.out.println(e.toString());
		}
		catch (Exception e ) {
			// Handle the exception when the phone number contains the sequence 911
			System.out.println("ERROR: Invalid 911 Sequence");
			System.out.println(e.toString());
		}
		}

	}

}
//Custom exception class for when a phone number is not exactly 10 digits long
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		this.num = num;
	}
	public String toString() {
		return ("TenDigitsException: " + num);
	}
	
}

//Custom exception class for when a phone number has a zero or nine area code
class AreaCodeException extends Exception{
	String num;
	AreaCodeException(String num){
		this.num = num;
	}
	public String toString() {
		return ("AreaCodeException: " + num);
	
}
}
