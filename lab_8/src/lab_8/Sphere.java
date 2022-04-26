package lab_8;

public class Sphere implements GeometricBody {
	private double radius;
	final double pi = 3.14;
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getSurface() {
		return Math.pow(radius, 2) * pi * 4;
	}

	@Override
	public double getVolume() {
		return Math.pow(radius, 3) * pi * 4 / 3;
	}	
}
