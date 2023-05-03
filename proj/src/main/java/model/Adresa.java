package model;

public class Adresa {
	private String adr;
	private Float X;
	private Float Y;
	
	public String getAdr() {
		return adr;
	}
	public void setAdr(String adr) {
		this.adr = adr;
	}
	public Float getX() {
		return X;
	}
	public void setX(Float x) {
		X = x;
	}
	public Float getY() {
		return Y;
	}
	public void setY(Float y) {
		Y = y;
	}
	public Adresa(String adr, Float x, Float y) {
		super();
		this.adr = adr;
		X = x;
		Y = y;
	}
	public Adresa() {
		super();
		this.adr= "nepoznato";
		this.X=0f;
		this.Y= 0f;
	}
	
}
