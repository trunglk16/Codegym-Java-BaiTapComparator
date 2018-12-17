package comparator;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    
    @Override
    public int compare(Circle cir1, Circle cir2) {
        if (cir1.getRadius() > cir2.getRadius()) return 1;
        else if (cir1.getRadius() < cir2.getRadius()) return -1;
        else return 0;
    }
}
