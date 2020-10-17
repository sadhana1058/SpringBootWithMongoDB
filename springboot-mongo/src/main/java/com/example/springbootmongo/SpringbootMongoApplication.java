package com.example.springbootmongo;
import com.example.dbinfo.NotesSchema;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongoApplication {
	
	 @Autowired
	 private static NotesSchema NotesSchema;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMongoApplication.class, args);
		System.out.println(NotesSchema);
	}


}
