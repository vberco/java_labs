package lab_1;

import java.util.Objects;

public class Monitor {
	public String Color;
	public String Resolutions;
	public Double Dimension;
	
	public Monitor() {}
	
	public Monitor(String color, String resolutions, Double dimension) {
		this.Color = color;
		this.Resolutions = resolutions;
		this.Dimension = dimension;
	}
	
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getResolutions() {
		return Resolutions;
	}
	public void setResolutions(String resolutions) {
		Resolutions = resolutions;
	}
	public Double getDimension() {
		return Dimension;
	}
	public void setDimension(Double dimension) {
		Dimension = dimension;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Color, Dimension, Resolutions);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Monitor other = (Monitor) obj;
		return Objects.equals(Color, other.Color) && Objects.equals(Dimension, other.Dimension)
				&& Objects.equals(Resolutions, other.Resolutions);
	}

	@Override
	public String toString() {
		return "Monitor [Color=" + Color + ", Resolutions=" + Resolutions + ", Dimension=" + Dimension + "]";
	}
	
	
}
