
package readfile;
import java.io.IOException;
//import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ReadFile {

    public static void main(String[] args)throws IOException {
      java.io.File file = new java.io.File("Task2.txt");
      int i;
      
     if (!file.exists()){
          System.out.println("File does not exist");
          System.exit(1);
     }
          // invoke and close PrintWriter class to create file
          try (
          java.io.PrintWriter output = new java.io.PrintWriter(file);
              )
          {
          for (i = 0; i < 100; i++){
              output.print((int) (Math.random() * 100) + 1);  
              output.print(" ");
          }
          }
	    ArrayList<Integer>list = new ArrayList<>();
	       try(
		   Scanner input = new Scanner(file);
		) {
		 while (input.hasNext()) {
		 list.add(input.nextInt());
	} 
                }
		Collections.sort(list);
                System.out.println( "Sorted List is " + list.toString());
                System.out.println();
      }
}       

