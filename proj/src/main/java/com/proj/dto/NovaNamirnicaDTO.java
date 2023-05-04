package com.proj.dto;

import model.NamirnicaTip;
import model.UkusTip;

public class NovaNamirnicaDTO {
	private String naziv;
	private NamirnicaTip tip;
	private UkusTip ukus;
	private int kalVred;
	
	public NovaNamirnicaDTO(String naziv, NamirnicaTip tip, UkusTip ukus, int kalVred) {
		super();
		this.naziv = naziv;
		this.tip = tip;
		this.ukus = ukus;
		this.kalVred = kalVred;
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
	
}
