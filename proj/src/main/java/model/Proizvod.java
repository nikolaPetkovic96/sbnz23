package model;

import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import com.proj.dto.NoviProizvodDTO;
@Document(collection="proizvodi")
public class Proizvod {
	
	@Id
	private String id;
	@DBRef
	private Restoran restoran;
	private String naziv;
	//@DBRef
	private ArrayList<Sastojak> sastojci;
	private Float cena;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}
	public void setSastojci(ArrayList<Sastojak>  sastojci) {
		this.sastojci = sastojci;
	}
	public Float getCena() {
		return cena;
	}
	public void setCena(Float cena) {
		this.cena = cena;
	}
	public Proizvod(String id, Restoran restoran, String naziv, ArrayList<Sastojak> sastojci, Float cena) {
		super();
		this.id = id;
		this.restoran = restoran;
		this.naziv = naziv;
		this.sastojci = sastojci;
		this.cena = cena;
	}	
	public Proizvod(NoviProizvodDTO dto) {
		this.naziv=dto.getNaziv();
		this.cena=dto.getCena();
		this.sastojci=(ArrayList<Sastojak>) dto.getSastojci().stream().map(x-> new Sastojak(x)).collect(Collectors.toList());
		
	}
	
}
