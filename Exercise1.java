/*
1. Write a Java program to create a class called "Person" with a name and age attribute. 
Create two instances of the "Person" class, set their attributes using the constructor, 
and print their name and age.
*/
public class Exercise1{

    static class Person{
    	public String name;
    	public int age;

    	Person(String name, int age){
    		this.name = name;
    		this.age = age;
    	}

    	
    }

	public static void main(String[] args) {
		Person p1 = new Person("Umair", 23);
		Person p2 = new Person("Spark", 19);
        
        System.out.println("P1 Name: " + p1.name + " And Age: " + p1.age);
    	System.out.println("P2 NAme: " + p2.name + " And Age: " + p2.age);


	}
}