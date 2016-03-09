package main.hessian;

import com.caucho.hessian.client.HessianProxyFactory;

import java.net.MalformedURLException;

/**
 * Created by SULVTO on 16-3-9.
 */
public class HessianServiceTest {
    private final static String SERVICE_URL = "http://localhost:8080/hessian-project/service";

    @Test
    public void testSayHello() {
        HessianProxyFactory proxyFactory = new HessianProxyFactory();
        try {
            HessianService hessianService = (HessianService) proxyFactory
                    .create(HessianService.class, SERVICE_URL);
            System.out.println(hessianService.sayHello("liping"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}