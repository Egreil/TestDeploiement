package com.tpdeploiement;

import org.springframework.boot.SpringApplication;

public class TestTpdeploiementApplication {

	public static void main(String[] args) {
		SpringApplication.from(TpdeploiementApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
