package fr.pereirafrederic.fpeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableEurekaServer
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class FpeEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(FpeEurekaApplication.class, args);
	}

}
