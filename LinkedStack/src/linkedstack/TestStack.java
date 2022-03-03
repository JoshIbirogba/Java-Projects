
package linkedstack;


public class TestStack {
    
   public static void main(String[] args) {

        LinkedStack s = new LinkedStack();
        s.push(" My name is Joshua Ibirogba ");          // push method
        s.push("I am a computing science student");

        System.out.println(s.pop());                     //pop method
        System.out.println(s.isEmpty());                 // isEmpty method 
    }

}
