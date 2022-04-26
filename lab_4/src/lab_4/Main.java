package lab_4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		List<String> equations = new ArrayList<String>();
		equations.add("((((((((((((((((((((2x-4y * 98 )))))))))))))))))))))");
		equations.add("2 * 4 + (3 +6 * 9 -    12 * (2*9 - 15))  + 2 +(-4)*((2 - 15))");
		equations.add("2x - 3y + 25 / (2+5)*12 - ((29*4-2) + 32) -14");
		equations.add("2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12");
		
		for(String equation : equations) {
			try {
				ArrayList<Character> equationElements = new ArrayList<Character>();
				var isValid = MathExpressionController.ValidateExpression(equation, equationElements);
				
				if (!isValid) {
					System.out.println("Expression in invalid because parentheses aren't paired");
				}
				
				MathExpressionController.CalculateExpression(equationElements);
			}
			catch(Exception e) {
				System.out.println(e.getMessage()); 
			}
		}
	}	
}
