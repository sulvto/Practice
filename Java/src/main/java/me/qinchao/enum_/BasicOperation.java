package me.qinchao.enum_;

/**
 * Created by sulvto on 16-5-15.
 */
public enum BasicOperation implements Operation {
    PLUS("+") {public double apply(double a, double b) {return a + b;}},
    MINUS("-") {public double apply(double a, double b) {return a - b;}},
    TIMES("*") {public double apply(double a, double b) {return a * b;}},
    DIVIDE("/") {public double apply(double a, double b) {return a / b;}};

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

}
