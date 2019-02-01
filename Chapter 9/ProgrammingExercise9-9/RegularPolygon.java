/*
Author: Jacob Almeida
Date: 01-30-2019

UML Diagram
-------------------------------
-n: int
-side: double
-x: double
-y: double
-perimeter: double
-area: double
-------------------------------
-RegularPolygon()
-RegularPolygon()
-RegularPolygon1()
-setN()
-setSide()
-setX()
-setY()
-getN()
-getSide()
-getX()
-getY()
-getPerimeter()
-getArea()
*/
import java.lang.Math;
class RegularPolygon {
	private int n = 3;
	private double side = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon(){
	}
	public RegularPolygon(int n, double side){
		this.n = n;
		this.side = side;
		this.x = 0;
		this.y = 0;
	}
	public RegularPolygon(int n, double side, double x, double y){
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	public void setN(){
		this.n = n;
	}
	public void setSide(){
		this.side = side;
	}
	public void setX(){
		this.x = x;
	}
	public void setY(){
		this.y = y;
	}
	public int getN(int n){
		return n;
	}
	public double getSide(double side){
		return side;
	}
	public double getX(double x){
		return x;
	}
	public double getY(double y){
		return y;
	}
	public double getPerimeter(){
		double perimeter = n * side;
		return perimeter;
	}
	public double getArea(){
		double area = (n * (side * side)) / (4 * (Math.tan(Math.PI / n)));
		return area;
	}
	
}