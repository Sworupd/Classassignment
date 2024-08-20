package models;

public class Measurement {
    public Integer val;

    public Measurement(Integer val) {
        this.val = val;
    }
    public int getCm(){
        return val * 100;
    }
    public double getKm(){
        return val / 1000.0;
    }
    public int getMm(){
        return val * 1000;
    }
    public int getDm(){
        return val * 10;
    }
}
