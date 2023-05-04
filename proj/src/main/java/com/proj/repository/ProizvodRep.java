package com.proj.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Korisnik;
import model.Proizvod;

public interface ProizvodRep extends  MongoRepository<Proizvod, String>{
	Proizvod findByNaziv(String naziv);
	List<Proizvod> findAllByNaziv(String naziv);
}
