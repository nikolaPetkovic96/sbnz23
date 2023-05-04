package model;

public enum UkusTip {
	NONE(0),
	LJUTO(1),
	SLATKO(2),
	KISELO(3),
	GORKO(4);
	
	
	private final int tip;
    private UkusTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
