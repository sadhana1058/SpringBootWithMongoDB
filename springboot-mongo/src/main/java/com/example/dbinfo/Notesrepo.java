package com.example.dbinfo;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface Notesrepo extends MongoRepository<NotesSchema, String> {
}

