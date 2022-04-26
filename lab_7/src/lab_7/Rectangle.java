package lab_7;

public class Rectangle extends Figure {
	private double length;
	private double width;
	
	public Rectangle(double lenght, double width) {
		super();
		this.length = lenght;
		this.width = width;
	}

	public double getLenght() {
		return length;
	}

	public void setLenght(double lenght) {
		this.length = lenght;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double GetArea() {
		return width * length;
	}

	@Override
	public double GetPerimeter() {
		return 2 * (width + length);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
