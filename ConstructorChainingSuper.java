public class ConstructorChainingSuper{
     
    String name;

    // constructor 1
    ConstructorChainingSuper(){
       this("");
        System.out.println("No-argument constructor of base class");
    }

    // constructor 2
    ConstructorChainingSuper(String name){
    	this.name = name;
    	System.out.println("Calling parameterized constructor of base");
    }

    public static void main(String[] args) {
		// calls parameterized constructor 4
        Derived obj = new Derived("Umair");

        // Calls No-argument constructor
        // Derived obj = new Derived();s
	}
}

class Derived extends ConstructorChainingSuper{

	// constructor 3
	Derived(){
		System.out.println("No-argument constructor of derived");
	}

	// parameterized constructor 4
	Derived(String name){
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized constructor of derived");
	}

}