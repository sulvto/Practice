package me.qinchao.example;

import ch.qos.logback.ext.spring.web.LogbackConfigListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by sulvto on 1/17/19.
 */
@ComponentScan
public class DemoApplication implements WebApplicationInitializer {

    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = getContext();

        servletContext.addListener(new ContextLoaderListener(applicationContext));

        // config logback
        servletContext.setInitParameter("logbackConfigLocation", "classpath:logback-spring.xml");
        servletContext.addListener(new LogbackConfigListener());

        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcher", new DispatcherServlet(applicationContext));
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }

    private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(DemoApplication.class);
        return context;
    }
}

