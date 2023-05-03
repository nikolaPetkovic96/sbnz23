package model.kategorije;

public enum ZaposlenjeKat{
	UNCHECKED(0),
    ZAPOSLEN(1),
    NEZAPOSLEN(2),
    PENZIONER(3),
    STUDENT(4);

    private final int tip;
    private ZaposlenjeKat(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
