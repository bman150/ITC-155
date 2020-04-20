// Writen by Alexander Baker on 4/20/2020
// ITC-155 Assignment 0 Octagon
// Represents octagonal shapes.
public class Octagon implements Shape {
	private double a;
	
	// constructs a new octagon with the given side length
	public Octagon(double a) {
		this.a = a;
	}

	// returns this octagons area
	public double getArea() {
		double A = 2 * (1 + Math.sqrt(2)) * a * a;
		return A;
	}

	// returns the perimeter of this octagon
	public double getPerimeter() {
		return 8 * a;
	}

}
