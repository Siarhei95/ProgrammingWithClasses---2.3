package task2_3;

public class State {
    private String capital;
    private double area;

    public State(String capital){
        this.capital = capital;
    }
    public State(double area){
        this.area = area;
    }

    public String getCapital() {
        return capital;
    }
    public double getArea(){
        return area;
    }
}
