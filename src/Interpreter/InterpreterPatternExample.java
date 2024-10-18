package Interpreter;

public class InterpreterPatternExample {
    public static void main(String[] args) {
        // Define the terminal expressions
        Expression trueExpr = new TerminalExpression(true);
        Expression falseExpr = new TerminalExpression(false);

        // Define non-terminal expressions (AND, OR, NOT)
        Expression orExpr = new OrExpression(trueExpr, falseExpr);    // true OR false = true
        Expression andExpr = new AndExpression(trueExpr, falseExpr);  // true AND false = false
        Expression notExpr = new NotExpression(trueExpr);             // NOT true = false

        // Evaluate expressions
        System.out.println("true OR false = " + orExpr.interpret());      // Output: true
        System.out.println("true AND false = " + andExpr.interpret());    // Output: false
        System.out.println("NOT true = " + notExpr.interpret());          // Output: false

        // Complex expression: NOT (true OR false)
        Expression complexExpr = new NotExpression(orExpr);               // NOT (true OR false) = false
        System.out.println("NOT (true OR false) = " + complexExpr.interpret());  // Output: false
    }
}
