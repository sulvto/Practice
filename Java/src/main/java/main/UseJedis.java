package main;

import org.omg.CORBA.Object;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;

/**
 * Created by SULVTO on 16-3-8.
 */
public class UseJedis {
    private static final Logger LOGGER = LoggerFactory.getLogger(UseJedis.class);

    public static void main(String[] args) {
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");

        System.out.println("Connection to server sucessfully");
        //查看服务是否运行
        System.out.println("Server is running: " + jedis.ping());

        //设置 redis 字符串数据
        jedis.set("key", "hello world");
        // 获取存储的数据并输出
        System.out.println("Stored string in redis:: " + jedis.get("key"));

    }

}
