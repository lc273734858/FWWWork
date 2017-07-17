package FWW.com.RegistCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RegistCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistCenterApplication.class, args);
	}
}
