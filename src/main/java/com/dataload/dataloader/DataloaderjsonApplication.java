package com.dataload.dataloader;

import com.dataload.dataloader.domain.State;
import com.dataload.dataloader.service.StateService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DataloaderjsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataloaderjsonApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(StateService stateService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<State>> typeReference = new TypeReference<List<State>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/users.json");
			try {
				List<State> users = mapper.readValue(inputStream,typeReference);
				stateService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
		};
	}

}
