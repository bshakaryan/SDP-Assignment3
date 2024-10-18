package Interpreter;

public class NotExpression implements Expression {
    private Expression expr;

    public NotExpression(Expression expr) {
        this.expr = expr;
    }

    @Override
    public boolean interpret() {
        return !expr.interpret();
    }
}
