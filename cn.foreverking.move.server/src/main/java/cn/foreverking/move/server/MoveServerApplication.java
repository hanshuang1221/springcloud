package cn.foreverking.move.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class MoveServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MoveServerApplication.class, args);
	}
}