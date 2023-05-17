/*
Problem Statement:
 Write a Java program to create a class called "Rectangle" with width and height attributes. 
 Calculate the area and perimeter of the rectangle.
*/

public class Exercise3{
     
    static class Rectangle{
    	int width;
    	int height;

    	public static int area(int width, int height){
    		int area = width * height;
    		return area;
    	}

    	public static int perimeter(int width, int height){
    		int perimeter = 2 * (height + width);
    		return perimeter;
    	}
    }

    public static void main(String[] args) {
        
        Rectangle rec = new Rectangle();

    	System.out.println("The Rectangle Area is: " + rec.area(7, 12));
    	System.out.println("The Rectangle Perimeter is: " + rec.perimeter(7, 12));
    }
}