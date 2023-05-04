package com.proj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Korisnik;
import model.Namirnica;

public interface NamirnicaRep extends MongoRepository<Namirnica, String> {

}
