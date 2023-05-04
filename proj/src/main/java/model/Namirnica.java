package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.proj.dto.NovaNamirnicaDTO;

@Document
public class Namirnica {
	@Id
	private String id;
	private String naziv;
	private NamirnicaTip tip;
	private UkusTip ukus;
	private int kalVred;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public Namirnica(String id, String naziv, NamirnicaTip tip, UkusTip ukus, int kalVred) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.tip = tip;
		this.ukus = ukus;
		this.kalVred = kalVred;
	}
	public Namirnica(String naziv, NamirnicaTip tip, UkusTip ukus, int kalVred) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.ukus = ukus;
		this.kalVred = kalVred;
	}
	public Namirnica(NovaNamirnicaDTO dto) {
		super();
		this.naziv = dto.getNaziv();
		this.tip = dto.getTip();
		this.ukus = dto.getUkus();
		this.kalVred = dto.getKalVred();
	}
	
}
