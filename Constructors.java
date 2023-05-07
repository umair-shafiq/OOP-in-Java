public class Constructors{

	public static void main(String args[]){
		Student st = new Student();
		Student st1 = new Student("Umair");
		System.out.println("Name: " + st1.name);
		Student st2 = new Student(66);
		System.out.println("Number: " + st2.number);
        st.name = "Spark";
		st.password = "abc";
        System.out.println("Password: " + st.password + " & Name: " + st.name);
		Student st3 = new Student(st);
		st3.password = "xyz";
		System.out.println("Password: " + st3.password + " & Name: " + st3.name);
	}
}

class Student{

	String name;
	int number;
	String password;

	//Non-parameterized
	Student(){
		System.out.println("The Constructor is Called...");
	}

	//Parameterized
	Student(String name){
		this.name = name;
	}

	Student(int number){
		this.number = number;
	}

	//Copy Constructor
    Student(Student st){
       this.name = st.name;
    }
}