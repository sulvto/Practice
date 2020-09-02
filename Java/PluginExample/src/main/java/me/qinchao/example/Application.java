package me.qinchao.example;

import me.qinchao.example.calc.Calc;
import me.qinchao.example.calc.Utils;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: Application.java, v0.1 02/09/2020 17:26 sulvto Exp$$
 */
public class Application {
    public static void main(String[] args) {
        Utils.addInterceptor(new ExamplePlugin());
        Calc calc = Utils.newAddCalc();
        System.out.println("calc result: " + calc.calc(1, 2));
    }
}
