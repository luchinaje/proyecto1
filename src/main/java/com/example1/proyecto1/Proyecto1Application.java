package com.example1.proyecto1;

import com.example1.proyecto1.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Proyecto1Application implements CommandLineRunner {

	private ComponentDependency componentDependency;

	public Proyecto1Application(@Qualifier("componentTwoImplement") ComponentDependency componentDependency){
		this.componentDependency=componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
	}
}
