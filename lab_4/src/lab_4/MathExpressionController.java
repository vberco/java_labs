package lab_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.naming.directory.InvalidAttributesException;

public class MathExpressionController {
	static ArrayList<Character> operators = new ArrayList<Character>(Arrays.asList(new Character[] { '/', '*', '-', '+' }));
	static ArrayList<Character> numbers = new ArrayList<Character>(
			Arrays.asList(new Character[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' }));
	static ArrayList<Character> variables = new ArrayList<Character>(Arrays.asList(new Character[] { 'x', 'y' }));
	
	public static Boolean ValidateExpression(String equation, ArrayList<Character> equationElements) {
		return Validate(equation, equationElements);
	}

	public static void CalculateExpression(ArrayList<Character> chars) {
		MathExpression finalExpression = new MathExpression();
		List<MathExpression> stack = new ArrayList<MathExpression>();
		var equation = "";
		var openedParentheses = 0;
		var isInnerExpression = false;
		double innerValue = 0;
		var number = "";
		var charsArray = chars.toArray();
		
		try {
			for (var i = 0; i < charsArray.length; i++) {
				var c = (char) charsArray[i];
				MathExpression stackExpression;

				if (c == '(') {
					openedParentheses++;
					isInnerExpression = true;
					stackExpression = new MathExpression();
					stack.add(openedParentheses - 1, stackExpression);
				} else if (c == ')') {
					var lastExpression = stack.remove(openedParentheses - 1);
					innerValue = CheckExpressionAndCalculate(lastExpression);
					openedParentheses--;

					if (openedParentheses == 0) {
						isInnerExpression = false;
						finalExpression.valueStack.add(innerValue);
					} else {
						var ex = stack.get(openedParentheses - 1);
						ex.valueStack.add(innerValue);
					}
				} else if (isInnerExpression) {
					stackExpression = stack.get(openedParentheses - 1);

					if (operators.contains(c)) {
						stackExpression.operatorStack.add(c);
					}

					if (numbers.contains(c)) {
						if (i + 1 < charsArray.length && numbers.contains(charsArray[i + 1])) {
							number += c;
						} else if (i + 1 < charsArray.length && variables.contains(charsArray[i + 1])) {
							number += c;
							equation += number + charsArray[i + 1] + charsArray[i + 2];
							number = "";
							i += 2;
						} else {
							number += c;
							var value = Double.parseDouble(number);
							stackExpression.valueStack.add(value);
							number = "";
						}

					}
				} else if (!isInnerExpression) {
					if (operators.contains(c)) {
						finalExpression.operatorStack.add(c);
					}

					if (numbers.contains(c)) {
						if (i + 1 < charsArray.length && numbers.contains(charsArray[i + 1])) {
							number += c;
						} else if (i + 1 < charsArray.length && variables.contains(charsArray[i + 1])) {
							number += c;
							equation += number + charsArray[i + 1] + charsArray[i + 2];
							number = "";
							i += 2;
						} else {
							number += c;
							finalExpression.valueStack.add(Double.parseDouble(number));
							number = "";
						}

					}
				}
			}

			if (openedParentheses != 0) {
				System.out.println("Math expression is not valid: opened paranthesis are more than closed");
			}

			var value = CheckExpressionAndCalculate(finalExpression);
			PrintResult(equation, value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void PrintResult(String equation, double value) {
		if (equation == "") {
			System.out.println("Math expression result = " + value);
		} else {
			if (value > 0) {
				equation += value;
			} else if (value == 0) {
				if (operators.contains(equation.charAt(equation.length() - 1))) {
					equation = equation.substring(0, equation.length() - 1);
				}
			} else {
				var lastOperator = equation.charAt(equation.length() - 1);

				if (lastOperator == '*' || lastOperator == '/') {
					equation += '(' + value + ')';
				} else if (lastOperator == '-') {
					equation = equation.substring(0, equation.length() - 1);
					equation += '+' + value * -1;
				} else {
					equation = equation.substring(0, equation.length() - 1);
					equation += value;
				}
			}

			System.out.println("Math equation is " + equation);
		}		
	}

	private static Boolean Validate(String expression, ArrayList<Character> equationElements) {
		var openedParantesisCount = 0;
		var closedParantesisCount = 0;

		for (char c : expression.strip().toCharArray()) {
			if (c == ' ') {
				continue;
			}

			equationElements.add(c);

			if (c == '(') {
				openedParantesisCount++;
			}

			if (c == ')') {
				closedParantesisCount++;
			}
		}

		if (Math.abs(openedParantesisCount - closedParantesisCount) == 1 && equationElements.get(0) == '('
				&& equationElements.get(equationElements.size() - 1) == ')') {

			if (openedParantesisCount - 1 == closedParantesisCount) {
				--openedParantesisCount;
				equationElements.remove(0);
			} else if (openedParantesisCount == closedParantesisCount - 1) {
				equationElements.remove(equationElements.size() - 1);
				--closedParantesisCount;
			}
		}

		return openedParantesisCount == closedParantesisCount
				|| (openedParantesisCount == 0 && closedParantesisCount == 0);
	}

	private static double CheckExpressionAndCalculate(MathExpression expression) throws Exception {
		if (expression.operatorStack.isEmpty()) {
			if (expression.valueStack.isEmpty()) {
				throw new EmptyParanthesesException("There isn't expession in paranthesis");
			}

			if (expression.valueStack.size() > 1) {
				throw new MissingOperatorException("There isn't any math operator in paranthesis");
			}
			return expression.valueStack.get(0);
		}

		if (expression.valueStack.isEmpty()) {
			throw new MissingValuesException("The paranthesis doesn't contains values");
		}

		if (expression.valueStack.size() == 1 && expression.operatorStack.size() == 1) {
			if (expression.operatorStack.get(0) == '-') {
				return 0 - expression.valueStack.get(0);
			} else {
				throw new InvalidExpressionException("Expression in paranthesis contains only one value");
			}
		} else if (expression.valueStack.size() - 1 != expression.operatorStack.size()) {
			throw new InvalidExpressionException("There are some erors in math expression in paranthesis: missed values or operators");
		}

		return Calculate(expression);
	}

	private static double Calculate(MathExpression expression) throws InvalidAttributesException {
		while (!expression.operatorStack.isEmpty()) {
			if (expression.operatorStack.contains('*')) {
				ExtractValues(expression, '*');
			} else if (expression.operatorStack.contains('/')) {
				ExtractValues(expression, '/');
			} else if (expression.operatorStack.contains('+')) {
				ExtractValues(expression, '+');
			} else if (expression.operatorStack.contains('-')) {
				ExtractValues(expression, '-');
			}
		}

		return expression.valueStack.get(0);
	}
	
	private static void ExtractValues(MathExpression expression, char operation) throws InvalidAttributesException {
		var index = expression.operatorStack.indexOf(operation);
		var operator = expression.operatorStack.remove(index);
		var rightElement = expression.valueStack.remove(index + 1);
		var leftElement = expression.valueStack.remove(index);
		var value = new MathOperation(leftElement, rightElement, operator).Execute();
		expression.valueStack.add(index, value);
	}
}
