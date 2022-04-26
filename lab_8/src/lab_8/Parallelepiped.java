package lab_8;

public class Parallelepiped implements GeometricBody {
	private double width;
	private double length;
	private double depth;
	
	public Parallelepiped(double width, double length, double depth) {
		super();
		this.width = width;
		this.length = length;
		this.depth = depth;
	}

	@Override
	public double getSurface() {
		return 2 * (width * length + length * depth + width * depth);
	}

	@Override
	public double getVolume() {
		return width * length * depth;
	}
}
