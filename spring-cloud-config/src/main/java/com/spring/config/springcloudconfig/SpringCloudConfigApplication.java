package com.spring.config.springcloudconfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyResourceConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigApplication.class, args);
	}

	@Bean
	PropertyResourceConfigurer getPropertyResourceConfigurer(){
		return new PropertyResourceConfigurer() {
			@Override
			protected void processProperties(ConfigurableListableBeanFactory configurableListableBeanFactory, Properties properties) throws BeansException {
				System.out.println("Hello");
			}
		};
	}

}
