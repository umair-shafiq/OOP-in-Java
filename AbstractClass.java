public class AbstractClass{
	public static void main(String[] args) {
		Hourse h = new Hourse();
		h.walk();
        h.changeColor();
        
		Chicken c = new Chicken();
		c.walk();

		Mustang myHourse = new Mustang();
		//Print: Animal constructor Called -> Hourse constructor Called -> Mustang constructor Called
	}
}

abstract class Animal{

	void eat(){
		System.out.println("Animail eats");
	}

	abstract void walk();

	String color;
	//Create Constructor for set By default color
	Animal(){
		System.out.println("1- Animal constructor Called.");
	}
}

class Hourse extends Animal{
    
    Hourse(){
    	System.out.println("2- Hourse constructor Called.");
    }

	void walk(){
		System.out.println("Hourse walks on 4 Legs");
	}

	void changeColor(){
		color = "Dark brown";
		System.out.println(color);
	}
}

class Chicken extends Animal{
	void walk(){
		System.out.println("Chicken walks on 2 Legs");
	}
}

class Mustang extends Hourse{
	Mustang(){
		System.out.println("3- Mustang constructor Called.");
	}
}
