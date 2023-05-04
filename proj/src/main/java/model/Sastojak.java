package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.proj.dto.NoviSastojakDTO;
@Document
public class Sastojak {
	@Id
	private String id;
	private Namirnica namirnica;
	private int kolicina;
	
	public Sastojak(NoviSastojakDTO x) {
		this.namirnica=new Namirnica(x.getNamirnica());
		this.kolicina=x.getKolicina();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Namirnica getNamirnica() {
		return namirnica;
	}
	public void setNamirnica(Namirnica namirnica) {
		this.namirnica = namirnica;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
}
