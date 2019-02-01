/*
Author: Jacob Almeida
Date: 1/16/2019
Description: Rectangle object class

UML Diagram
----------------------------------------------
+width: double
+height: double
----------------------------------------------
+Rectangle()
+Rectangle(width: double, height: double)
+getArea(): double
+getPerimiter: double
----------------------------------------------

Rule 1: 

Rule 2: If attribute has getters and setters, it is acceptable to make it a private variable since there are other ways of accessing it
*/
class Rectangle {
	// Attributes; -Object characteristics; global variables
	// Generally attributes are not initialized unless default value
	double width = 1;
	double height = 1;
	
	// Constructors - create the object instance variable when called
	// Generally, no args will be first if you have one
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	// Build object methods
	public double getArea() {
		double area = this.width * this.height;
		return area;
		
		// you can also return this.width * this.height;
	}
	
	public double getPerimeter() {
		double perimeter = (2 * this.width) + (2 * this.height);
		return perimeter;
		
		// you can also return (2 * this.width) + (2 * this.height);
	}
	
}