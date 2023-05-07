public class ShallowDeepCopy{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Umair";
		s1.no = 66;
		s1.marks[0] = 40;
		s1.marks[1] = 50;
		s1.marks[2] = 60;
        
        Student s2 = new Student(s1);
		System.out.println(s2.name);
		System.out.println(s2.no);
		System.out.println("Marks: ");
		s1.marks[2] = 100;
		for (int i=0; i<3; i++) {
			System.out.print(s2.marks[i] + " ");
		}
	}
}

class Student{
	String name;
	int no;
	int marks[];

    Student(){
    	 marks = new int[3]; 
    }

	//Shallow Copy Constructor
	/*Student(Student s1){
		this.name = s1.name;
		this.no = s1.no;
        this.marks = s1.marks;
	}*/
    

    //Deep Copy Constructor
    Student(Student s1){
    	marks = new int[3]; 
		this.name = s1.name;
		this.no = s1.no;
        for (int i=0; i<3; i++) {
			this.marks[i] = s1.marks[i];
		}
	}

}