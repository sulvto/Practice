package me.qinchao.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import me.qinchao.hessian.service.HessianService;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.IOException;

/**
 * Created by SULVTO on 16-3-9.
 */
public class Main {

    public static void main(String[] args)throws Exception {
        String url = "http://127.0.0.1:8080/hessian";
        HessianProxyFactory factory = new HessianProxyFactory();
        HessianService service = (HessianService) factory.create(HessianService.class, url);
        System.out.println(service.sayHello("Hessian"));
    }
}
