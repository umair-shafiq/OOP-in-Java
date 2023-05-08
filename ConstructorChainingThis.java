public class ConstructorChainingThis{
    
    // default constructor 1
    ConstructorChainingThis(){ 
       System.out.println("default");
    }

    // parameterized constructor 2
    ConstructorChainingThis(int x){
    	// invokes default constructor
        this();
        System.out.println(x);
    }

    // parameterized constructor 3
    ConstructorChainingThis(int x, int y){
    	// invokes parameterized constructor 2
        this(5);
        System.out.println(x * y);
    }

	public static void main(String[] args) {
		// invokes parameterized constructor 3
		new ConstructorChainingThis(8, 10);
	}
}