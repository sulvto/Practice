package me.qinchao.util;

import me.qinchao.domain.Job;
import org.junit.Test;

import java.net.URL;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by sulvto on 16-5-30.
 */
public class LuceneUtilTest {
    @Test
    public void createIndex() throws Exception {

    }

    @Test
    public void search() throws Exception {
        List<Job> search = LuceneUtil.search("北京", "City", null);
        search.forEach(System.out::println);
    }

    @Test
    public void setjob() throws Exception {

    }

}