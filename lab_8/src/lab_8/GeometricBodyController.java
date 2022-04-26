package lab_8;

import java.util.List;

public class GeometricBodyController {
	public static double GetMaxVolume(List<GeometricBody> figures) {
		double maxVolume = 0;
		
		for(GeometricBody figure : figures) {
			var figureVolume = figure.getVolume();
			
			if(figureVolume > maxVolume) {
				maxVolume = figureVolume;
			}			
		}
		
		return maxVolume;
	}
	
	public static double GetMaxSurface(List<GeometricBody> figures) {
		double maxSurface = 0;
		
		for(GeometricBody figure : figures) {
			var figureSurface = figure.getSurface();
			
			if(figureSurface > maxSurface) {
				maxSurface = figureSurface;
			}			
		}
		
		return maxSurface;
	}
}
