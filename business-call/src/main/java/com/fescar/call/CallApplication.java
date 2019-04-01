package com.fescar.call;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.fescar.call")
@EnableDubbo(scanBasePackages = "com.fescar.call")
public class CallApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallApplication.class, args);
	}

}
