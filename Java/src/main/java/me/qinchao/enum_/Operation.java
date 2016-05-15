package me.qinchao.enum_;

/**
 * Created by sulvto on 16-5-15.
 */
public enum Operation {
    PLUS("+") {double apply(double a, double b) {return a + b;}},
    MINUS("-") {double apply(double a, double b) {return a - b;}},
    TIMES("*") {double apply(double a, double b) {return a * b;}},
    DIVIDE("/") {double apply(double a, double b) {return a / b;}};

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    abstract double apply(double a, double b);
}
