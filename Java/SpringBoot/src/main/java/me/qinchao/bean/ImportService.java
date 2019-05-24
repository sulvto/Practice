package me.qinchao.bean;

import org.springframework.context.annotation.Bean;

/**
 * Created by sulvto on 2/13/19.
 */
public class ImportService {
    @Bean
    public SimpleServiceInImportService simpleServiceInImportService() {
        return new SimpleServiceInImportService();
    }
}
