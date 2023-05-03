package com.proj.dto;

import java.util.Date;

public class NoviKorDTO {
	private String username;
	private String  password;
	private String email;
	private String ime;
	private String prezime;
	private Date datumRodj;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public NoviKorDTO(String username, String password, String email, String ime, String prezime, Date datumRodj) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRodj = datumRodj;
	}
}
