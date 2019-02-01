class ProgrammingExercise9_9 {
	public static void main(String[] args) {
		RegularPolygon polygon1 = new RegularPolygon(6, 4);
		RegularPolygon polygon2 = new RegularPolygon(10, 4, 5.6, 7.8);
		RegularPolygon polygon3 = new RegularPolygon();
		
		System.out.println(" Polygon 1 \n Perimeter: " + polygon1.getPerimeter() + "\n Area: " + polygon1.getArea() + "\n");
		System.out.println(" Polygon 2 \n Perimeter: " + polygon2.getPerimeter() + "\n Area: " + polygon2.getArea() + "\n");
		System.out.println(" Polygon 3 \n Perimeter: " + polygon3.getPerimeter() + "\n Area: " + polygon3.getArea());
	}
}