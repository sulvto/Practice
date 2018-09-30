package me.qinchao.web.config;

import org.lokra.seaweedfs.core.FileSource;
import org.lokra.seaweedfs.core.FileTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by sulvto on 9/30/18.
 */
@Configuration
public class SeaweedfsConfig  {

    @Value("${fs.host}")
    private String host;

    @Value("${fs.port}")
    private int port;

    @Bean
    public FileSource fileSource() {
        FileSource fileSource = new FileSource();
        fileSource.setHost(host);
        fileSource.setPort(port);
        return fileSource;
    }

    @Bean
    public FileTemplate fileTemplate(FileSource fileSource) {
        return new FileTemplate(fileSource.getConnection());
    }

}
