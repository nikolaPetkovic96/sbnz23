package model;

public enum NamirnicaTip {
	VOCE(0),
	POVRCE(1),
	MESO(2),
	MLECNI_PROIZ(3),
	TESTENINA(4);
	
	private final int tip;
    private NamirnicaTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
