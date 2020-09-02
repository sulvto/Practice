package me.qinchao.example.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by sulvto on 02/09/2020.
 *
 * @author sulvto
 * @version $Id: DbConfig.java, v0.1 02/09/2020 11:52 sulvto Exp$$
 */
@Configuration
@MapperScan(value="me.qinchao.example.mapper")
public class DbConfig {

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        String resource = "mybatis.xml";
        try (InputStream inputStream = Resources.getResourceAsStream(resource)) {
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(inputStream);
            build.getConfiguration().addInterceptor(new ExamplePlugin());
            build.getConfiguration().addInterceptor(new ExamplePluginB());
            return build;
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
