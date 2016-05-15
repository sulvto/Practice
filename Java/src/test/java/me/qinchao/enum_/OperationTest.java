package me.qinchao.enum_;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-15.
 */
public class OperationTest {

    @Test
    public void testApply() throws Exception {
        double x = 10;
        double y= 10;
        for (Operation operation:
             Operation.values()) {
            System.out.printf("%f %s %f = %f%n",x,operation,y,operation.apply(x, y));
        }
    }
}