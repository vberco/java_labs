package lab_7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Figure[] figures = new Figure[3];
		figures[0] = new Square(4);
		figures[1] = new Rectangle(5.5, 6.3);
		figures[2] = new Triangle(4.4, 6.5, 8);
		
		for(Figure fig : figures) {
			System.out.println(fig.toString());
			System.out.println("Figure area = " + fig.GetArea());
			System.out.println("Figure perimeter = " + fig.GetPerimeter());
		}
		
		var maxPerimeter = FigureController.GetMaxPerimeter(Arrays.asList(figures));
		System.out.println("Max perimeter = " + maxPerimeter);
		
		var maxArea = FigureController.GetMaxArea(Arrays.asList(figures));
		System.out.println("Max area = " + maxArea);
		
		class Circle extends Figure{
			final double pi = 3.14;
			
			public Circle(double radius) {
				super();
				this.radius = radius;
			}

			private double radius;
			
			public double getRadius() {
				return radius;
			}

			public void setRadius(double radius) {
				this.radius = radius;
			}

			@Override
			public double GetArea() {
				return pi * Math.pow(radius, 2);
			}

			@Override
			public double GetPerimeter() {
				return 2 * pi * radius;
			}
		}
		var circle = new Circle(5);
		System.out.println("Figure of the anonimous class Circle has area = " + circle.GetArea());
		System.out.println("Figure of the anonimous class Circle has perimeter = " + circle.GetPerimeter());
		
		var figuresList = new ArrayList<Figure>();
		figuresList.add(circle);
		figuresList.add(figures[0]);
		figuresList.add(figures[1]);
		figuresList.add(figures[2]);
		
		System.out.println("Biggest area = " + FigureController.GetMaxArea(figuresList));
	}
}
