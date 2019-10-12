package task2_3;

public class Printer {

    public void print(State state){
        String cap = state.getCapital();
        System.out.println("Capital: "+cap);
    }
    public void print0(State state){
        double area = state.getArea();
        System.out.println("Total area of Belarus: " + area+" км²");
    }
    public void print1(Region region){
        System.out.println("Number of regions: "+region.number());
    }
}
