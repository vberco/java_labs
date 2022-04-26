package lab_7;

public class Square extends Figure {

	private double length;
	
	public Square(double lenght) {
		super();
		this.length = lenght;
	}

	public double getLenght() {
		return length;
	}

	public void setLenght(double lenght) {
		this.length = lenght;
	}

	@Override
	public double GetArea() {
		return length * length;
	}

	@Override
	public double GetPerimeter() {
		return 4 * length;
	}

	@Override
	public String toString() {
		return "Square [length=" + length + "]";
	}
}
