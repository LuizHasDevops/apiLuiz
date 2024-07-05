package br.edu.infnet.luizApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LuizApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuizApiApplication.class, args);
	}

}
