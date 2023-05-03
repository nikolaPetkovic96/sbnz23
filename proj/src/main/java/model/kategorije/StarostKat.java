package model.kategorije;

public enum StarostKat{
	UNCHECKED(0),
    DETE(1),
    ODRASTAO(2),
    PENZIONER(3);

    private final int tip;
    private StarostKat(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
