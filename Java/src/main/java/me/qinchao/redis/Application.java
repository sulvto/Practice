package me.qinchao.redis;

import me.qinchao.redis.dao.IUserDao;
import me.qinchao.redis.dao.impl.UserDaoImpl;
import me.qinchao.spring.service.MessagePrinter;
import org.eclipse.jetty.server.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * Created by SULVTO on 16-3-15.
 */
//@Configuration
@ComponentScan
public class Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);


    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);
        IUserDao userDao = context.getBean(UserDaoImpl.class);

        userDao.setUser("example", new User("example", 1));
        LOGGER.debug(userDao.getUser("example").toString());
        userDao.setUser("example2", new User("example2", 1));
        LOGGER.debug(userDao.getUser("example2").toString());
        LOGGER.debug(userDao.getUser("example").toString());

    }
}
