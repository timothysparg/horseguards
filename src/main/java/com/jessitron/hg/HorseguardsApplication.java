package com.jessitron.hg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {}, excludeName = { "exclude" })
public class HorseguardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HorseguardsApplication.class, args);
	}
}
