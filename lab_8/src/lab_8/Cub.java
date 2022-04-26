package lab_8;

public class Cub implements GeometricBody {//extends
	private double height;
	
	public Cub(double height) {
		this.height = height;
	}
	
	@Override
	public double getSurface() {
		return 6 * Math.pow(height, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(height, 3);
	}

}
