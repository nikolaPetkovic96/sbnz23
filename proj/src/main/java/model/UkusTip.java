package model;

public enum UkusTip {
	LJUTO(0),
	SLATKO(1),
	KISELO(2),
	GORKO(3);
	
	
	private final int tip;
    private UkusTip(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}
