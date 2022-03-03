
import java.util.Scanner;


public class Part44 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[50];
        int[] userNum = new int[10];

        int stopNumber;
        boolean found;
        int location = -1;
        String loop = "Y";
        

        while(loop.equals("Y")){

        for (int i = 0; i < 50; i++) {
            list[i] = (int) (Math.random() * 9 + 1);
            System.out.print(list[i]);
        }

            System.out.println();            
            System.out.println();
            System.out.println("Enter the sequence of numbers you wish to search for:");

            stopNumber = 10;
            found = false;
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                userNum[i] = input.nextInt();

                if (userNum[i] == 0) {
                    stopNumber = i;
                    break;
                }
            }
            for (int i = 0; i < list.length - 3 ; i++) {
                location = i;
                if (userNum[0] == list[i]) {
                    for (int j = 1; j < stopNumber; j++) {
                        if (list[j + i] == userNum[j]) {
                            if (j == (stopNumber - 1)) {
                                found = true;
                                break ;
                            }
                        } else  {
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }
            }
        
        System.out.print("The sequence ");
        for (int i = 0; i < stopNumber; i++) {
            System.out.print(userNum[i] + "");
        }
        if (found) {
            System.out.println(" is FOUND - it starts at index location " + location);
        } else {
            System.out.println(" is NOT FOUND in the list.");
        }
        System.out.println();
        System.out.print("Do you wish to search for another (Y/N): ");
        loop = input.next().toUpperCase();
            }

    }
}
