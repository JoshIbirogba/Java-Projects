package files;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class PasswordChecker {

	public static void main(String[] args) {
		
		//Create the file path
		String filename = "C:\\Users\\ibiro\\eclipse-workspace\\JavaTraining\\src\\PasswordChecker.txt";
		
		//Create an array to store the passwords
		String[] passwords = new String[13];
		
		//Store current password being validated
		String password = "";
		
		//Create a file object 
		File file = new File(filename);
		
		
		
		try {
			//create a new buffered reader to read the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			// Loop through each line of the file and add it to the phoneNumbers array
						for (int i = 0; i < passwords.length; i++) {
						passwords[i] = br.readLine();
						}
		}
		catch (FileNotFoundException e) {
			// Handle the exception when the file is not found
			System.out.println("ERROR: FILE NOT FOUND............");
			e.printStackTrace();
		}
		catch (IOException e) {
			// Handle the exception when the file cannot be read
						System.out.println("ERROR: File cannot be read............");
						e.printStackTrace();
		}
		// Check each phone number in the array for validity
				for (int x = 0; x < passwords.length; x++) {
					password = passwords[x];
					
		try {
			  // Check if password contains an integer
	        boolean hasInt = false;
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isDigit(password.charAt(i))) {
	                hasInt = true;
	                break;
	            }
	        }
	        if (!hasInt) {
	            throw new NoIntegerException(password);
	        }
	        
	        //check for letter in password
	        boolean hasLetter = false;
	        for (int i = 0; i < password.length(); i++) {
	            if (Character.isAlphabetic(password.charAt(i))) {
	                hasLetter = true;
	                break;
	            }
	        }
	        if (!hasLetter) {
	            throw new NoLetterException(password);
	        }
	        
	      //check for special character in password
	        boolean hasSpecChar = false;
	        for (int i = 0; i < password.length(); i++) {
	            if (!Character.isLetterOrDigit(password.charAt(i))) {
	                hasSpecChar = true;
	                break;
	            }
	        }
	        if (!hasSpecChar) {
	            throw new NoSpecCharException(password);
	        }
	        
	        // Password is valid
	        System.out.println("Password " + password + " is valid.");
	        
	    } catch (NoIntegerException e) {
	        System.out.println("ERROR: Password " + password + " does not contain an integer.");
	    }
		
		catch (NoLetterException e) {
			System.out.println("ERROR: Password " + password + " does not contain a letter");
		}
		catch (NoSpecCharException e) {
			System.out.println("ERROR: Password " + password + " does not contain a special character");
		}
		
	}
		}


}

    //Custom exception class for when a password does not have an integer
	class NoIntegerException extends Exception {
		String pass;
		NoIntegerException(String num){
			this.pass = pass;
		}
		public String toString() {
			return ("NoIntegerException: " + pass);
		}
	}

    //Custom exception class for when a password does not have a Letter
	class NoLetterException extends Exception {
		String pass;
		NoLetterException(String num){
			this.pass = pass;
		}
		public String toString() {
			return ("NoLetterException: " + pass);
		}
	}

	//Custom exception class for when a password does not have a special character
	class NoSpecCharException extends Exception {
		String pass;
		NoSpecCharException(String num){
			this.pass = pass;
		}
		public String toString() {
			return ("NoSpecCharException: " + pass);
		}
	}
