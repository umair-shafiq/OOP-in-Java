public class MultipleInheritanceEx{
	public static void main(String[] args) {
		Bear b = new Bear();
		b.fruit();
		b.grass();
		b.vegitables();
		b.chicken();
		b.meat();
		b.fish();
	}
}

interface Herbivore{
	void fruit();
	void grass();
	void vegitables();
}

interface Carnivore{
	void chicken();
	void meat();
	void fish();
}

class Bear implements Herbivore, Carnivore{
	void eat(){
		System.out.println("Eating");
	}

	public void fruit(){
		System.out.println("Eating Fruits");
	}

	public void grass(){
		System.out.println("Eating Grass");
	}

	public void vegitables(){
		System.out.println("Eating vegitables");
	}

	public void chicken(){
		System.out.println("Eating chicken");
	}

	public void meat(){
		System.out.println("Eating meat");
	}

	public void fish(){
		System.out.println("Eating fish");
	}
}