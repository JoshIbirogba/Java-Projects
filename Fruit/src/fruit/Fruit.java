package fruit;


public class Fruit {

    private static Integer numberOfFruit = 0;
    protected String name = "";
    protected Integer school;
    
public Fruit(){
    numberOfFruit++;
}

public void Fruit(String name){
    this.name = name;
}

protected String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public String whatAmI(){
    return " Fruit ";
}

    @Override
    public String toString(){
    return this.whatAmI();
}
    public static int getNumberOfFruit(){
        return numberOfFruit;
    }
}


