/*
Write a Java program to create a class called "Circle" with a radius attribute. 
You can access and modify this attribute. Calculate the area and circumference of the circle.
*/

public class Exercise4{

    static class Circle{
    	private double radius;

    	public void setRadius(double radius){
    		this.radius = radius;
    	}

    	public double getRadius(){
    		return radius;
    	}

    	public static double area(double radius) {
    		double a = 3.14 * radius * radius;
    		return a;
    	}

    	public static double circumference(double radius) {
    		double c = 2 * 3.14 * radius;
    		return c;
    	}
    }

	public static void main(String[] args) {
		Circle cir = new Circle();
        
        int r = 5;
		cir.setRadius(r);
		double area = cir.area(cir.getRadius());

		double circumference = cir.circumference(cir.getRadius());

		System.out.println("Radius of the circle is " + r);
		System.out.println("The area of the circle is " + area);
		System.out.println("The circumference of the circle is " + circumference);
	}
}