
package fruit;


public class DryFruit extends Fruit {
    
    DryFruit(String name){
        this.name = name;
    }
    @Override
    public String whatAmI(){
    return " Fruit " + this.name;
}
    @Override
    public boolean equals(Object x){
        return (x instanceof DryFruit) && (this.name.equals(((DryFruit)x).name));
    }
}
