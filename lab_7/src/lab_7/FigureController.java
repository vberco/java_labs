package lab_7;

import java.util.List;

public class FigureController {
	public static double GetMaxArea(List<Figure> figures) {
		double area = 0;
		
		for(Figure figure : figures) {
			var figureArea = figure.GetArea();
			
			if(figureArea > area) {
				area = figureArea;
			}			
		}
		
		return area;
	}
	
	public static double GetMaxPerimeter(List<Figure> figures) {
		double maxPerimeter = 0;
		
		for(Figure figure : figures) {
			var perimeter = figure.GetPerimeter();
			
			if(perimeter > maxPerimeter) {
				maxPerimeter = perimeter;
			}			
		}
		
		return maxPerimeter;
	}
}
