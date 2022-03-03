
package linkedqueue;

public class TestQueue {
    public static void main (String []args){
          LinkedQueue p = new LinkedQueue();
        p.add(" Java is Difficult to be honest");
        p.add(" But we keep pushing ");
        p.add(" I Want to become a software Engineer ");
        
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.remove());
        System.out.println(p.isEmpty());
    }
    

}
