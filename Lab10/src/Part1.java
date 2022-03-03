import java.util.Scanner;

public class Part1 {


    public static void main(String[] args) {
        int [] list = {1,3,6,7,12,-8};
        int [] gap = new int [6];
        int i;
        System.out.print("List is :");
            for (i = 0; i < list.length; i++){
                System.out.printf(" %1d ", list[i]);
            } System.out.println();
            
        for( i = 1; i<list.length; i++){
            gap[i] = list[i] - list[i-1];
            
            System.out.println("Gap " + i + "  : " + gap[i]);
        }
        
    }
    
}
