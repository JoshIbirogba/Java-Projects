
public class BinarySearch {

    static char data [] = {'a','b','e','f'};
    
    public static int Search(char [] datalist, char keylock){
        int down = 0;
        int up = datalist.length - 1;
        
        while (down <= up){
            int middle = (down + up)/2;
            if (keylock < datalist[middle]) up = middle - 1;
            else if (keylock == datalist[middle])
            return (char) middle;
            else down = middle + 1;
        } down++;
        return -1;        
        }
    
    public static void main(String[] args) {
        
        int binarysearch;
        
        binarysearch = Search(data, 'c');
        System.out.println(binarysearch);
        
        binarysearch = Search(data, 'f');
        System.out.println(binarysearch);
    }
    
}
