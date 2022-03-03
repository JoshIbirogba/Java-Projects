
import java.util.Scanner;

public class Part4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] random = new int[50];
        int[] num = new int[10];
        int i, j;
        int len = 0;
        int count = 0;
        
//random numbers
        for (i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * 9 + 1);
            System.out.print(random[i]);
        }
        System.out.println();
        
        // 1-4 
       for (int z = 1; z <= 4; z++){
            System.out.print("         ");
             System.out.print(z);
      }
       System.out.println();
       
        int number = 0;
       for (int a = 0; a < 5; a++){
           for (int b = 0; b < 10; b++) 
               System.out.print(b);    
       } 

       
        System.out.println();
        System.out.println("Enter the sequence of numbers you wish to search for : ");
        for (j = 1; j < num.length; j++) {
            System.out.print("Enter number  " + (j) + " : ");
            num[j] = input.nextInt();

            if (num[j] == 0) {
                break;
            }
            count++;
        }
        int location = -1;
        for (i = 0; i < random.length - 3; i++) {
            for (int k = 0; k < count; k++) {
                if (random[i + 1] == num[j]) {
                    location = i;
                break;
                }
            }
        }
        if (location == -1) {
            System.out.println("The Sequence " + num[j]+ " is not FOUND");

        } else {
            System.out.println(" The Sequence " + num[j]+ "is FOUND - it starts at index location " + location);

        }
    }
            }


