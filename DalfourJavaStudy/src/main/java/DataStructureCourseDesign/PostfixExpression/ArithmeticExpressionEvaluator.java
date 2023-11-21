package DataStructureCourseDesign.PostfixExpression;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ArithmeticExpressionEvaluator {
    
    public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("请输入一个数学表达式:");
			String input = sc.next();
			String postfix = toPostfix(input);
			System.out.println("后缀表达式: " + postfix);
			double result = evaluatePostfix(postfix);
			System.out.println("计算结果: " + result);
		}
    }

    public static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(infix, "+-*/()", true);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            char c = token.charAt(0);
            switch (c) {
                case '(':
                	operatorStack.push(c);
                    break;
                case ')':
                    while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                        postfix.append(operatorStack.pop());
                        postfix.append(' ');
                    }
                    
                    if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    	operatorStack.pop();
                    }
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                    while (!operatorStack.isEmpty() && getPrecedence(operatorStack.peek()) >= getPrecedence(c)) {
                        postfix.append(operatorStack.pop());
                        postfix.append(' ');
                    }
                    operatorStack.push(c);
                    break;
                default:
                    postfix.append(token);
                    postfix.append(' ');
                    break;
            }
        }
        
        while (!operatorStack.isEmpty()) {
            postfix.append(operatorStack.pop());
            postfix.append(' ');
        }
        
        return postfix.toString().trim();
    }
    
    public static double evaluatePostfix(String postfix) {
        Stack<Double> postfixStack = new Stack<>();
        StringTokenizer tokenizer = new StringTokenizer(postfix, " ", false);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().trim();
            
            if (token.length() == 0) {
                continue;
            }
            
            char c = token.charAt(0);
            
            if (Character.isDigit(c)) {
            	postfixStack.push(Double.parseDouble(token));
            } else {
                double y = postfixStack.pop();
                double x = postfixStack.pop();
                switch (c) {
                    case '+':
                    	postfixStack.push(x + y);
                        break;
                    case '-':
                    	postfixStack.push(x - y);
                        break;
                    case '*':
                    	postfixStack.push(x * y);
                        break;
                    case '/':
                    	postfixStack.push(x / y);
                        break;
                }
            }
        }
        return postfixStack.pop();
    }
    
    public static int getPrecedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
