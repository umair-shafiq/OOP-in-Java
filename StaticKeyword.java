public class StaticKeyword{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.schoolName = "FFHS";
		System.out.println(s1.schoolName);
        Student s2 = new Student();
        System.out.println(s2.schoolName);
	}
}

class Student{
	int roll;
	String name;

	static String schoolName;

	void setName(String name){
		this.name = name;
	}

	String getName(){
		return this.name;
	}

	void setRoll(int roll){
		this.roll = roll;
	}

	int getRoll(){
		return this.roll;
	}
}