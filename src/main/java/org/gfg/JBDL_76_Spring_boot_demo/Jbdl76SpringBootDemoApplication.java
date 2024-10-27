package org.gfg.JBDL_76_Spring_boot_demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Jbdl76SpringBootDemoApplication {

	public static void main(String[] args) {
		 // level was info
		SpringApplication.run(Jbdl76SpringBootDemoApplication.class, args);
		Temp.temp();

	}
//	@Bean
//	public ObjectMapper objectMapper(){
//		return  new ObjectMapper();
//	}
}
