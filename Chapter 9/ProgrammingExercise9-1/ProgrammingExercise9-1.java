class ProgrammingExercise9_1 {
	public static void main(String[] args) {
		//Declare object instance variables
		Rectangle rect1 = new Rectangle(4 , 40);
		System.out.println("Rectangle 1\n");
		//Display object information
		System.out.println("Width of Rectangle 1: " + rect1.width);
		System.out.println("Height of Rectangle 1: " + rect1.height);
		System.out.println("Area of Rectangle 1: " + rect1.getArea());
		System.out.println("Perimeter of Rectangle 1: " + rect1.getPerimeter() + "\n");
		
		/*
		System.out.println("Width of Rectangle 1: " + rect1.width + 
		"\n Height of Rectangle 1: " + rect1.height + 
		"\n Area of Rectangle 1: " + rect1.getArea() + 
		"\n Perimeter of Rectangle 1: " + rect1.getPerimeter());
		*/
		Rectangle rect2 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle 2\n");
		System.out.println("Width of Rectangle 2: " + rect2.width);
		System.out.println("Height of Rectangle 2: " + rect2.height);
		System.out.println("Area of Rectangle 2: " + rect2.getArea());
		System.out.println("Perimeter of Rectangle 2: " + rect2.getPerimeter());
		
	}
}