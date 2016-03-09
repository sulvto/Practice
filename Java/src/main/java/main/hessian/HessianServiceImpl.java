package main.hessian;

/**
 * Created by SULVTO on 16-3-9.
 */
public class HessianServiceImpl implements HessianService {
    @Override
    public String sayHello(String name) {
        return "hello: " + name;
    }
}
