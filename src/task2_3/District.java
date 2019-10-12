package task2_3;

import java.util.Arrays;

public class District {

    public void dist(Region region){
        String [] d = region.getRegions();
        for (int i=0; i<d.length; i++){ }
        System.out.println("Regional centers: "+Arrays.toString(d));
    }
}
