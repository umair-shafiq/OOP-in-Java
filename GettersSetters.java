public class GettersSetters{
	public static void main(String args[]){
       Student st = new Student();
       st.setName("Umair");
       st.setRollNo(66);

       System.out.println("Name: " + st.getName());
       System.out.println("Roll Number: " + st.getRollNo());
	}
}

class Student{
	private String name;
	private int rollNo;
    
    //Setters
	void setName(String name){
		this.name = name;
	}

	void setRollNo(int rollNo){
		this.rollNo = rollNo;
	}

	//Getters

	String getName(){
		return this.name;
	}

	int getRollNo(){
		return this.rollNo;
	}
}