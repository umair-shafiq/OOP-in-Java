public class ClassesObjects{
	public static void main(String args[]){
        Book bk = new Book();
        bk.setTitle("Java OOPS");
        bk.setQuantity(12);
        System.out.println("Book Title: " + bk.title);
        System.out.println("Quantity: " + bk.quantity);
         
        System.out.println("-----------------------");

        Student st = new Student();
        st.setName("Umair");
        st.setCgpa(3.68f);
        System.out.println("Student Name: " + st.name);
        System.out.println("CGPA: " + st.cgpa);

	}
}

class Book{
	String title;
	int quantity;

	void setTitle(String newTitle){
		title = newTitle;
	}

	void setQuantity(int newQuantity){
		quantity = newQuantity;
	}
}

class Student{
	String name;
	float cgpa;

	void setName(String newName){
		name = newName;
	}

	void setCgpa(float newCgpa){
		cgpa = newCgpa;
	}
}