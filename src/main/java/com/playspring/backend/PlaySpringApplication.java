package com.playspring.backend;

import com.playspring.backend.config.InitializaData;
import com.playspring.backend.resource.publication.PublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PlaySpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlaySpringApplication.class, args);
		InitializaData.populateData();
	}



}
