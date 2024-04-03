package task10OOPS;
public class Person {
    private String name;
    private int age;
    
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person1 = new Person("Uma", 23);
        
        // Getting and printing attributes
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
    }
}



