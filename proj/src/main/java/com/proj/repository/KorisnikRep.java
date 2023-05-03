package com.proj.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Korisnik;

public interface KorisnikRep extends MongoRepository<Korisnik, String> {

}
