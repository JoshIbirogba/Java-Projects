import java.util.Scanner;

public class Part3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int list[] = new int [50];
        int userlist[] = new int [4];
        int i;
        int usernum1, usernum2, usernum3, usernum4;
        String loop = "Y";
        
        while (loop.equals("Y")){
        for (i = 0; i < list.length; i++){
        list[i] = (int) (Math.random()* 9 + 1);
        System.out.print(list[i]);
        }
System.out.println();
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
        System.out.println();
        System.out.println("Enter the sequence of digits you wish to search for: ");
        System.out.print("Enter number 1 : ");
        usernum1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        usernum2 = input.nextInt();
        System.out.print("Enter number 3 : ");
        usernum3 = input.nextInt();
        System.out.print("Enter number 4 : ");
        usernum4 = input.nextInt();
        System.out.println();
        
        int location = -1;
for ( i= 0; i < list.length - 3; i++){
if((list[i]==usernum1 && list[i + 1]==usernum2 && list[i + 2]==usernum3 && list[i + 3]==usernum4)) {
    location = i;
break;
}
}

if (!(location == -1)){
    System.out.println("The sequence " + usernum1 + "" + usernum2 +  "" + usernum3 + "" + usernum4+ " is FOUND - it starts at location "  + location  );
}
else{ 
    System.out.println("The sequence " + usernum1 + "" + usernum2 +  "" + usernum3 + "" + usernum4 + " is NOT FOUND on the list" );
}
        System.out.println();
        System.out.println();
        System.out.print("Do you wish to do another (Y/N)? : ");
        loop = input.next().toUpperCase();
        }
            }
    }    

