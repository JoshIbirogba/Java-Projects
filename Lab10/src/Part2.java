import java.util.Scanner;

public class Part2 {

    
    public static void main(String[] args) {
        
        int [] array = {3,8,10,1,9,14,-3,0,14,207,56,98,12};
        int i;
        int newlocation = 0;
        int len = 1;
        int longLen = 1;
 
        int location = 0;
        int longLoc= 0;
        int count = 0;
        
      while (location < array.length-1){
       len = 1;
        for (i = location; i < array.length; i++){
            if (array[i] <= array[i+1]){
                newlocation = i + 1; 
                len++;
            }
            else break;
        }
        if (len > longLen) {
            longLen = len;
            longLoc = location;}
        
        location = newlocation + 1;

        
    }
      System.out.println("Longest sequence is : " + longLen);
        System.out.println("Location         is : " + longLoc);
        System.out.println();
        
        System.out.print("Sequence values are : ");
        for (i = longLoc; i < longLoc + longLen; i++){
               System.out.printf(" %1d ", array[i]);
           }
        System.out.println();
    }
}
    

