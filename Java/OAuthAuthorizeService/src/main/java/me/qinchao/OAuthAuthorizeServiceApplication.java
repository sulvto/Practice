package me.qinchao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
public class OAuthAuthorizeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OAuthAuthorizeServiceApplication.class, args);
	}
}
