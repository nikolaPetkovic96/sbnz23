package com.proj.dto;

public class NoviSastojakDTO {
	
	private NovaNamirnicaDTO namirnica;
	private int kolicina;
	public NoviSastojakDTO(NovaNamirnicaDTO namirnica, int kolicina) {
		super();
		this.namirnica = namirnica;
		this.kolicina = kolicina;
	}
	public NovaNamirnicaDTO getNamirnica() {
		return namirnica;
	}
	public void setNamirnica(NovaNamirnicaDTO namirnica) {
		this.namirnica = namirnica;
	}
	public int getKolicina() {
		return kolicina;
	}
	public void setKolicina(int kolicina) {
		this.kolicina = kolicina;
	}
	
	
}
