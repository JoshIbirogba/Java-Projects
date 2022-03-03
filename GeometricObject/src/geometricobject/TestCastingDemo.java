
package geometricobject;

public class TestCastingDemo {
      public static void main(String[] args) {
        Object object1 = new Circle(9);
        Object object2 = new Rectangle(8, 7);
        
        displayObject(object1);
        displayObject(object2);
    }
    public static void displayObject(Object object){
        if(object instanceof Circle){
            System.out.println("The circle area is : " + ((Circle)object).getArea());
            System.out.println("The circle area is : " + ((Circle)object).getDiameter());
        }
        else if (object instanceof Rectangle){
            System.out.println("The circle area is : " + ((Rectangle)object).getArea());
        }
    }
}
