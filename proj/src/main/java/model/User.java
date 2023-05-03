package model;

public class User {
	
	private String email;
	private String username;
	private String password;
	private Adresa adresa;
	public User(String email, String username, String password, Adresa adresa) {
		super();
		this.email = email;
		this.username = username;
		this.password = password;
		this.adresa = adresa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
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
	public Adresa getAdresa() {
		return adresa;
	}
	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}
	
	
	
}
