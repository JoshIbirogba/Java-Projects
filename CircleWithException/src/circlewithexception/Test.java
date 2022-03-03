
package circlewithexception;


 
public class Test {
  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(4,6);
      CircleWithException c2 = new CircleWithException(5,7);
      CircleWithException c3 = new CircleWithException(8,3);
    }
    catch (IllegalArgumentException ex) {
      System.out.println(ex);
      throw ex;
    }
    finally{
        System.out.println("Thank you");
    }

    System.out.println("Number of objects created: " +
      CircleWithException.getNumberOfObjects());
    
    int i; int sum = 0; 
    for (i = 0; i < 10; i++){
        sum += i;
    }
    assert i == 10;
    //assert (sum  > 10 && < 5 * 10) : "sum is " + sum);
  }
  
}