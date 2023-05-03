package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Namirnica {
	@Id
	private Long id;
	private String naziv;
	private NamirnicaTip tip;
	private UkusTip ukus;
	private int kalVred;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	public NamirnicaTip getTip() {
		return tip;
	}
	public void setTip(NamirnicaTip tip) {
		this.tip = tip;
	}
	public UkusTip getUkus() {
		return ukus;
	}
	public void setUkus(UkusTip ukus) {
		this.ukus = ukus;
	}
	public int getKalVred() {
		return kalVred;
	}
	public void setKalVred(int kalVred) {
		this.kalVred = kalVred;
	}
	public Namirnica(Long id, String naziv, NamirnicaTip tip, UkusTip ukus, int kalVred) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.tip = tip;
		this.ukus = ukus;
		this.kalVred = kalVred;
	}
	
	
}
