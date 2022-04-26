package lab_4;

import javax.naming.directory.InvalidAttributesException;

public class MathOperation {
	private double leftElement;
	private double rightElement;
	private char operator;
	
	public MathOperation(double leftElement, double rightElement, char operator) {
		this.leftElement = leftElement;
		this.rightElement = rightElement;
		this.operator = operator;
	}
	
	public double Execute() throws InvalidAttributesException {
		if(operator == '*') {
			return leftElement * rightElement;
		}
		else if(operator == '/') {
			return Math.floor(operator / rightElement);
		}
		else if(operator == '+') {
			return leftElement + rightElement;
		}
		else if(operator == '-') {
			return leftElement - rightElement;
		}
		
		throw new InvalidAttributesException("Invalid operator " + operator);
	}
}
