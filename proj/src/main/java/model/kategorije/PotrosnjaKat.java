package model.kategorije;
public enum PotrosnjaKat{
    NONE(0),
    BRONZE(1),
    SILVER(2),
    GOLD(3);

    private final int tip;
    private PotrosnjaKat(int tip){
        this.tip = tip;
    }
    public int getTip(){
        return tip;
    }
}