package me.qinchao.redis;

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

        //查看服务是否运行
        LOGGER.debug("Server is running: " + jedis.ping());
        LOGGER.debug("Connection to server sucessfully");

        //设置 redis 字符串数据
        jedis.set("key", "hello world");
        // 获取存储的数据并输出
        LOGGER.info("Stored string in redis:: " + jedis.get("key"));

    }

}
