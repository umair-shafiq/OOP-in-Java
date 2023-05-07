public class Inheritance{

	public static void main(String[] args) {
		Fish shark = new Fish();
		shark.eat();
		shark.swim();

		Dog dogy = new Dog();
		dogy.eat();
		dogy.breathe();
		dogy.legs = 4;
		System.out.println(dogy.legs);
	}
}

//Base Class
class Animal{
	String color;
	void eat(){
		System.out.println("Eats");
	}

	void breathe(){
		System.out.println("Breathes");
	}

}


//Derived Class

class Fish extends Animal{
	int fins;

	void swim(){
		System.out.println("Swims");
	}
}

//Multi-Level Inheritance
class Mammal extends Animal{
	int legs;
}

class Dog extends Mammal{
	String breed;
}

//******************//

class Bird extends Animal{
	void fly(){
		System.out.println("Flying");
	}
}