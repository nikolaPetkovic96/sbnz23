package model;

public enum IshranaTip {
	NONE(0),
	VEGETERIJANAC(1),
	VEGAN(2)
	;
	private final int tip;
    private IshranaTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
