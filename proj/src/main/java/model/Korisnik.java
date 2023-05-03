package model;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;
@Document
public class Korisnik extends User{
	
	@Id private long id;
	private String ime;
	private String prezime;
	private Date datumRodj;
	@DocumentReference
	private ArrayList<Porudzbina> porudzbina;
	private KorKategorije kategorije;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public Date getDatumRodj() {
		return datumRodj;
	}
	public void setDatumRodj(Date datumRodj) {
		this.datumRodj = datumRodj;
	}

	public int getGodine() {
		long god= ChronoUnit.YEARS.between(new Date().toInstant(), datumRodj.toInstant());	
		return (int)god;
	}
	public ArrayList<Porudzbina> getPorudzbina() {
		return porudzbina;
	}
	public void setPorudzbina(ArrayList<Porudzbina> porudzbina) {
		this.porudzbina = porudzbina;
	}
	public KorKategorije getKategorije() {
		return kategorije;
	}
	public void setKategorije(KorKategorije kategorije) {
		this.kategorije = kategorije;
	}
	public Korisnik(String email, String username, String password, Adresa adresa, String ime, String prezime,
			Date datumRodj, ArrayList<Porudzbina> porudzbina, KorKategorije kategorije) {
		super(email, username, password, adresa);
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodj = datumRodj;
		this.porudzbina = porudzbina;
		this.kategorije = kategorije;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
  
}
