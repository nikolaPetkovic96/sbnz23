package model;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@Document
public class Proizvod {
	
	@Id
	private Long id;
	@DocumentReference
	private Restoran restoran;
	private String naziv;
	@DocumentReference
	private Map<Namirnica, Long> sastojci;
	private Float cena;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Restoran getRestoran() {
		return restoran;
	}
	public void setRestoran(Restoran restoran) {
		this.restoran = restoran;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public Map<Namirnica, Long> getSastojci() {
		return sastojci;
	}
	public void setSastojci(Map<Namirnica, Long> sastojci) {
		this.sastojci = sastojci;
	}
	public Float getCena() {
		return cena;
	}
	public void setCena(Float cena) {
		this.cena = cena;
	}
	public Proizvod(Long id, Restoran restoran, String naziv, Map<Namirnica, Long> sastojci, Float cena) {
		super();
		this.id = id;
		this.restoran = restoran;
		this.naziv = naziv;
		this.sastojci = sastojci;
		this.cena = cena;
	}	
}
