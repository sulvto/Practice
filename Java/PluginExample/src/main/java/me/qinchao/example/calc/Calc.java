package me.qinchao.example.calc;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Calc.java, v0.1 02/09/2020 17:54 sulvto Exp$$
 */
public class Calc {
    private Op op;

    public Calc(Op op) {
        this.op = op;
    }

    public Object calc(Object left, Object right) {
        return op.op(left, right);
    }
}
