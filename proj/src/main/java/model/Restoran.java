package model;

import java.util.ArrayList;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document
public class Restoran extends User {
	
	public Restoran(String email, String username, String password, Adresa adresa) {
		super(email, username, password, adresa);
		// TODO Auto-generated constructor stub
	}

	private String naziv;
	@DocumentReference
	private ArrayList<Proizvod> meni;
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public ArrayList<Proizvod> getMeni() {
		return meni;
	}
	public void setMeni(ArrayList<Proizvod> meni) {
		this.meni = meni;
	}
	
	
	

}
