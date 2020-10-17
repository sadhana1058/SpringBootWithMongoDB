package com.example.springbootmongo;

import com.example.dbinfo.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongoApplication {
	
	 @Autowired
	 private static NotesRepository NotesRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
		//System.out.println(NotesRepository.findAll());
	}
//	 @Override
//	    public void run(String... strings) throws Exception {
//	        System.out.println(userRepository.findAll());
//	    }

}
