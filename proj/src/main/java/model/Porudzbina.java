package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
public class Porudzbina {
	
	@DocumentReference
	private Korisnik kor;
	@DocumentReference
	private Restoran rest;
	ArrayList<Proizvod> stavke;
	private LocalDateTime datum;
	private Float cena;
	public Korisnik getKor() {
		return kor;
	}
	public void setKor(Korisnik kor) {
		this.kor = kor;
	}
	public Restoran getRest() {
		return rest;
	}
	public void setRest(Restoran rest) {
		this.rest = rest;
	}
	public ArrayList<Proizvod> getStavke() {
		return stavke;
	}
	public void setStavke(ArrayList<Proizvod> stavke) {
		this.stavke = stavke;
	}
	public LocalDateTime getDatum() {
		return datum;
	}
	public void setDatum(LocalDateTime datum) {
		this.datum = datum;
	}
	public Float getCena() {
		return cena;
	}
	public void setCena(Float cena) {
		this.cena = cena;
	}
	public Porudzbina(Korisnik kor, Restoran rest, ArrayList<Proizvod> stavke, LocalDateTime datum, Float cena) {
		super();
		this.kor = kor;
		this.rest = rest;
		this.stavke = stavke;
		this.datum = datum;
		this.cena = cena;
	}
	
}
