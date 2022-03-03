/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruit;

/**
 *
 * @author ibiro
 */
public class TestClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fruit a,b,c,d,e,f;
        a = new Fruit();
        b = new FleshyFruit("Apple");
        c = new FleshyFruit("Apple");
        d = new FleshyFruit("apple");
        e = new DryFruit("Hazelnut");
        System.out.println("The number of Fruit is: "+Fruit.getNumberOfFruit());
        System.out.println("The number of Fruit is: "+a.getNumberOfFruit());
        System.out.println(a);
        System.out.println(b);
        System.out.println(e.whatAmI());
        System.out.println(b.equals(c));
        System.out.println(b.equals(d));
        System.out.println(b.equals(e));
        f = a;
        System.out.println(f.equals(a));
}

}
