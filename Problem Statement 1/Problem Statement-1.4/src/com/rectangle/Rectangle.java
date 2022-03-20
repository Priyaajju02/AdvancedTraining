package com.rectangle;

import java.util.Scanner;

public class Rectangle {
	float length;
	float width;
	float area;
	float perimeter;
	public float getLength() {
		return length;
	}
	public void setLength(float length) {
		this.length = length;
	}
	public Float getWidth() {
		return width;
	}
	public void setWidth(Float width) {
		this.width = width;
	}
	public Rectangle()
        {
    	  length = 1;
    	  width= 1;
        }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter width of Rectangle: ");
        width = sc.nextFloat();
        System.out.println(" ");
        System.out.println("--------------------------------");
    }
    
    void  AreaRectangle()
    {
        area = length * width;
       
    }
 
     void  PerimeterRectangle()
    {
    	 perimeter = 2*(length + width);
       
    }

    void display() {
    	if(length>0.0 && length<20.0)
        {
    	    System.out.println(" ");
            System.out.printf("Area of Rectangle : %.2f\n",+(area));
            System.out.printf("Perimeter of Rectangle : %.2f",+(perimeter));
            System.out.println(" ");
        }
       
        }

    public static void main(String args[]) {
    	
        Rectangle obj1 = new Rectangle();
        obj1.input();
        obj1.AreaRectangle();
        obj1.PerimeterRectangle();
        obj1.display();
        System.out.println(" ");
        System.out.println("-------------------------------");
        Rectangle obj2 = new Rectangle();
        obj2.input();
        obj2.AreaRectangle();
        obj2.PerimeterRectangle();
        obj2.display();
        System.out.println(" ");
        System.out.println("-------------------------------");
        Rectangle obj3 = new Rectangle();
        obj3.input();
        obj3.AreaRectangle();
        obj3.PerimeterRectangle();
        obj3.display();
        System.out.println(" ");
        System.out.println("-------------------------------");
        Rectangle obj4 = new Rectangle();
        obj4.input();
        obj4.AreaRectangle();
        obj4.PerimeterRectangle();
        obj4.display();
        System.out.println(" ");
        System.out.println("-------------------------------");
        Rectangle obj5 = new Rectangle();
        obj5.input();
        obj5.AreaRectangle();
        obj5.PerimeterRectangle();
        obj5.display();
    	
    }

}
