package lab_2;

public class Box {
	public double Height;
	public double Width;
	public double Depth;
	
	public Box() {
		this.Height = 1;
		this.Width = 1;
		this.Depth = 1;
	}
	
	public Box(double value) {
		this.Height = value;
		this.Width = value;
		this.Depth = value;
	}
	
	public Box(double height, double width, double depth) {
		this.Height = height;
		this.Width = width;
		this.Depth = depth;
	}

	@Override
	public String toString() {
		return "Box [Height=" + Height + ", Width=" + Width + ", Depth=" + Depth + "]";
	}
	
	public double Area() {
		return 2 * Height * Width + 2 * Height * Depth + 2 * Depth * Width;
	}
	
	public double Volume() {
		return  Height * Width * Depth;
	}
}
