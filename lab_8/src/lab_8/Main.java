package lab_8;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		var geometricBodies = new ArrayList<GeometricBody>();
		geometricBodies.add(new Cub(6));
		geometricBodies.add(new Sphere(8.5));
		geometricBodies.add(new Parallelepiped(4.5, 9, 3));
		
		System.out.println("Biggest surface = " + GeometricBodyController.GetMaxSurface(geometricBodies));
		System.out.println("Biggest volume = " + GeometricBodyController.GetMaxVolume(geometricBodies));
		System.out.println("After change abstract class to interface, only change that we need to do we need to replace word /implements/ with /extends/");
	}
}
