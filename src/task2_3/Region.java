package task2_3;

public class Region {
    private String capital = "Minsk";
    private String num1 = "Brest";
    private String num2 = "Vitsebsk";
    private String num3 = "Gomel";
    private String num4 = "Grodno";
    private String num5 = "Mogilev";
    private String[]regions = new String[]{capital,num1,num2,num3,num4,num5};

    public String[] getRegions() {
        return regions;
    }
    int count = 0;

    public int number(){
        String[]d = getRegions();
        for(int i=0; i<d.length;i++){
            count++;
        }
        return count;
    }
}
