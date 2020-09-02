package me.qinchao.example.calc;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Add.java, v0.1 02/09/2020 17:56 sulvto Exp$$
 */
public class Add implements Op {
    @Override
    public Object op(Object left, Object right) {
        return Double.parseDouble(left.toString()) + Double.parseDouble(left.toString());
    }

    public Object op(int left, int right) {
        return left + right;
    }

    public Object op(double left, double right) {
        return left + right;
    }
}
