package lab_7;

public class Triangle extends Figure {
	private double leg1;
	private double leg2;
	private double hypotenuse;
	
	public Triangle(double leg1, double leg2, double hypotenuse) {
		super();
		this.leg1 = leg1;
		this.leg2 = leg2;
		this.hypotenuse = hypotenuse;
	}

	public double getLeg1() {
		return leg1;
	}

	public void setLeg1(double leg1) {
		this.leg1 = leg1;
	}

	public double getLeg2() {
		return leg2;
	}

	public void setLeg2(double leg2) {
		this.leg2 = leg2;
	}

	public double getHypotenuse() {
		return hypotenuse;
	}

	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
	}

	@Override
	public double GetArea() {
		return (leg1*leg2)/2;
	}

	@Override
	public double GetPerimeter() {
		return leg1 + leg2 + hypotenuse;
	}

	@Override
	public String toString() {
		return "Triangle [leg1=" + leg1 + ", leg2=" + leg2 + ", hypotenuse=" + hypotenuse + "]";
	}
}
