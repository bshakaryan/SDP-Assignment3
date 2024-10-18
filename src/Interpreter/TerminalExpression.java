package Interpreter;

public class TerminalExpression implements Expression {
    private boolean value;

    public TerminalExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return this.value;
    }
}
