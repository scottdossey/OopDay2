import java.util.ArrayList;
import java.util.List;

public class Car //Inherits from Object.
{
    public String name;
    public String color;
    
    public Car()
    {
    }
    
    public Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }
    
    @Override
    public String toString()
    {
        return String.format("This %s car is %s.", 
                             this.name,
                             this.color);        
    }
    
    
    public static void main(String[] args)
    {
        Car myCar = new Car("crossover", "blue");
        
        Object value = myCar;
        List<Object> holdsAny = new ArrayList<>();
        holdsAny.add(myCar);
        holdsAny.add("Hello");
        holdsAny.add(43);
        
        
        
        
        System.out.println(myCar);
    }
}
