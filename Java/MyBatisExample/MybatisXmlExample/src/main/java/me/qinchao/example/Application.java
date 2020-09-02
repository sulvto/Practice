package me.qinchao.example;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import me.qinchao.example.mapper.UserMapper;
import me.qinchao.example.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sulvto on 27/08/2020.
 *
 * @author sulvto
 */

@Slf4j
public class Application {
    public static void main(String[] args) {
        String resource = "mybatis.xml";
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            try (SqlSession session = sqlSessionFactory.openSession()) {
                UserMapper mapper = session.getMapper(UserMapper.class);
                User user = mapper.selectUser();
                log.info(JSON.toJSONString(user));
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
