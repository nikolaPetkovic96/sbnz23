package model;
import model.kategorije.PotrosnjaKat;
import model.kategorije.StarostKat;
import model.kategorije.ZaposlenjeKat;
public class KorKategorije {
    private StarostKat starost;
    private ZaposlenjeKat zaposlenje;
    private PotrosnjaKat potrosnja;
    private IshranaTip ishrana;

    public StarostKat getStarost() {
        return starost;
    }
    public ZaposlenjeKat getZaposlenje() {
        return zaposlenje;
    }
    public PotrosnjaKat getPotrosnja() {
        return potrosnja;
    }

	public void setStarost(StarostKat starost) {
		this.starost = starost;
	}
	public void setZaposlenje(ZaposlenjeKat zaposlenje) {
		this.zaposlenje = zaposlenje;
	}
	public void setPotrosnja(PotrosnjaKat potrosnja) {
		this.potrosnja = potrosnja;
	}
	
	public IshranaTip getIshrana() {
		return ishrana;
	}
	public void setIshrana(IshranaTip ishrana) {
		this.ishrana = ishrana;
	}
	public KorKategorije() {
		super();
		this.starost=StarostKat.UNCHECKED;
		this.zaposlenje=ZaposlenjeKat.UNCHECKED;
		this.potrosnja=PotrosnjaKat.NONE;
		this.ishrana=IshranaTip.NONE;
	}
	public KorKategorije(StarostKat starost, ZaposlenjeKat zaposlenje, PotrosnjaKat potrosnja, IshranaTip ishrana) {
		super();
		this.starost = starost;
		this.zaposlenje = zaposlenje;
		this.potrosnja = potrosnja;
		this.ishrana = ishrana;
	}

}


