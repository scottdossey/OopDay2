

public class Person
{
    
    //instance variables/properties/field/attributes
    String name;
    int age;
    String location;
    
    //Constructors
    //typically a constructor will set the values
    //for all the instance variables of the class.
    
    public Person() 
    {
        //Empty constructor
    }
    
    public Person(String name, int age, String location)
    {               
        this.name = name;
        this.age = age;
        this.location = location;
    }
    
    public Person(String name) 
    {
        this.name = name;
    } 
   
    public void sayHello() 
    {
        System.out.println("Hello " + name);        
    }
        
    public int ageAtBirthday()
    {
        return age+1;                   
    }
    
    public int birthYear(int currentYear)
    {
        int birthYear = currentYear - age;
        return birthYear;
    }
    
    //a static method means that there is no "this", we do not
    //need to call this method from an instance.
    public static void main(String[] args)
    {
        Person firstPerson = new Person(); 
        Person secondPerson = new Person("John");
        Person thirdPerson = new Person("Jane", 45, "London");
        thirdPerson.sayHello(); //Calls sayHello on the object/instance thirdPerson
        System.out.println(thirdPerson.name + " will be "
                         + thirdPerson.ageAtBirthday()
                         + " years old next year!");
        System.out.println(thirdPerson.name + " was born in the year "+
                           thirdPerson.birthYear(2021));
        Person fourthPerson = new Person("Mike", 34, "San Diego");
        System.out.println(fourthPerson.name);
        
        
    }
}
