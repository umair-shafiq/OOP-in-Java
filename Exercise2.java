/*
Problem Statement:
Write a Java program to create a class called "Dog" with a name and breed attribute. 
Create two instances of the "Dog" class, set their attributes using the constructor and 
modify the attributes using the setter methods and print the updated values.
*/

public class Exercise2{

  static class Dog{
       private String name;
       private String breed;

       public Dog(String name, String breed){
            this.name = name;
            this.breed = breed;
       }
       
       public void setName(String name){
       	   this.name = name;
       }

       public void setbreed(String breed){
       	   this.breed = breed;
       }

    }


	public static void main(String[] args) {
		Dog dog1 = new Dog("Buddy", "Golden Retriever");
        System.out.println("Name: " + dog1.name + " And breed: " + dog1.breed);

        Dog dog2 = new Dog("Charlie", "Bulldog");
        System.out.println("Name: " + dog2.name + " And breed: " + dog2.breed);

        dog1.setName("Puppy");
        dog1.setbreed("Labrador Retriever");
        dog2.setName("Daisy");
        dog2.setbreed("Hidi");

        System.out.println("********* Updated Values **************");
        System.out.println("Name: " + dog1.name + " And breed: " + dog1.breed);
        System.out.println("Name: " + dog2.name + " And breed: " + dog2.breed);
	}
}