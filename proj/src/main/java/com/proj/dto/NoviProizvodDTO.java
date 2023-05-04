package com.proj.dto;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.DBRef;

import model.Namirnica;
import model.Restoran;
import model.Sastojak;

public class NoviProizvodDTO {
	
	//private Restoran restoran;
	private String naziv;
	private ArrayList<NoviSastojakDTO>  sastojci;
	private Float cena;
	public NoviProizvodDTO(String naziv, ArrayList<NoviSastojakDTO> sastojci, Float cena) {
		super();
		//this.restoran = restoran;
		this.naziv = naziv;
		this.sastojci = sastojci;
		this.cena = cena;
	}
//	public Restoran getRestoran() {
//		return restoran;
//	}
//	public void setRestoran(Restoran restoran) {
//		this.restoran = restoran;
//	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public ArrayList<NoviSastojakDTO> getSastojci() {
		return sastojci;
	}
	public void setSastojci(ArrayList<NoviSastojakDTO>sastojci) {
		this.sastojci = sastojci;
	}
	public Float getCena() {
		return cena;
	}
	public void setCena(Float cena) {
		this.cena = cena;
	}
	
	
}
