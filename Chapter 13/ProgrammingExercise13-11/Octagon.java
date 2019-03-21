/*
Author: Jacob Almeida
Date: 03-20-2019
*/

class Octagon extends AbstractGeometricObject implements Cloneable, Comparable<Octagon> {
	private double sideLen;
	
	public Octagon() {
		super();
		this.sideLen = 1;
	}
	
	public Octagon(double l) {
		super();
		this.sideLen = l;
	}
	
	public Octagon(String c, boolean f, double l) {
		super(c, f);
		this.sideLen = l;
	}
	
	 @Override
	public double getArea() {
		return ((2 + 4 / Math.sqrt(2)) * sideLen * sideLen);
	}
	
	@Override
	public double getPerimeter() {
		return sideLen * 8;
	}
	
	@Override
	public Object clone() {
		//Shallow Copy
		//return super.clone();
		
		//Deep Copy
		try {
		Octagon copy = (Octagon)super.clone();
		copy.sideLen = this.sideLen;
		return copy;
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
	
	@Override
	public int compareTo(Octagon o) {
		if (this.sideLen > o.sideLen) {
			return 1;
		}
		else if (this.sideLen == o.sideLen) {
			return 0;
		}
		else {
			return -1;
		}
	}
}