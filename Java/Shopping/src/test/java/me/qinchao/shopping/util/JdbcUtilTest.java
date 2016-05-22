package me.qinchao.shopping.util;

import org.junit.Test;

import javax.sql.DataSource;

import java.sql.Connection;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-22.
 */
public class JdbcUtilTest {
    @Test
    public void getDataSource() throws Exception {
        DataSource dataSource = JdbcUtil.INSTANCE.getDataSource();
    }

}