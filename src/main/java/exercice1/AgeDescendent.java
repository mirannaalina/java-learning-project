package exercice1;

import java.util.Comparator;

public class AgeDescendent implements Comparator<String> {

    public int compare(String o1, String o2){
        return Integer.valueOf(o1.split(",")[1]).compareTo(Integer.valueOf(o2.split(",")[1]));
    }
}
