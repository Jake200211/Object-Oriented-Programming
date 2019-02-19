/*
Author: Jacob Almeida
Date: 
--------------------------------------------------
				GeometricObject
--------------------------------------------------
- color: String
- filled: boolean
- dateCreated: java.util.Date
--------------------------------------------------
+ GeometricObject()
+ GeometricObject(color: String, filled: boolean)
+ getColor(): String
+ setColor(color: String): void
+ isFilled(): boolean
+ setFilled(filled: boolean): void
+ getDateCreated(): java.util.Date
+ toString(): String
--------------------------------------------------

--------------------------------------------------
		Triangle Extends GeometricObject
--------------------------------------------------
- side1: double
- side2: double
- side3: double
--------------------------------------------------
+ Triangle()
+ Triangle(side1: double, side2: double, side3: double)
+ getSide1(): double
+ getSide2(): double
+ getSide3(): double
+ getArea(): double
+ getPerimeter(): double
+ toString(): String
--------------------------------------------------
*/
class Triangle extends GeometricObject {
	//Encapulate attributes
	private double side1;
	private double side2;
	private double side3;
	
	//Constructors calling super method
	public Triangle(){
		//call parent constructor
		super();
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
	}
	
	public Triangle(double s1, double s2, double s3){
		//call parent constructor
		super();
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public Triangle(double s1, double s2, double s3, String color, boolean filled){
		super(color, filled);
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1(){
		return this.side1;
	}
	
	public double getSide2(){
		return this.side2;
	}
	
	public double getSide3(){
		return this.side3;
	}
	
	//mutators
	/*public void setSide1(double side) {
		this.side1 = side;
	}
	*/
	
	public double getArea() {
		double s = (this.side1 + this.side2 + this.side3) / 2;
		double area = Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
		return area;
	}
	
	public double getPerimeter() {
		return this.side1 + this.side2 + this.side3;
	}
	
	public String toString() {
		return "Triangle:\nside1 = " + this.side1 + "\n\tside2 = " + this.side2 + "\n\tside 3 = " + this.side3 + "\n\tarea = " + this.getArea() + "\n\tperimeter = " + this.getPerimeter() + "\n" + super.toString();
	}
}