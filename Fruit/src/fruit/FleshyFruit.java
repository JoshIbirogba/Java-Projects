
package fruit;

public class FleshyFruit extends Fruit{
    
    public FleshyFruit(String name){
        this.name = name;
    }
    
    @Override
        public String whatAmI(){
    return "Fleshy Fruit " + this.name;
}
        
    @Override
         public boolean equals(Object x){
        return (x instanceof FleshyFruit) && (this.name.equals(((FleshyFruit)x).name));
    }
    
}



