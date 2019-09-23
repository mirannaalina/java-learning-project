package exercice1;

import java.util.Comparator;

public class AgeComparator implements Comparator<String> {

    public int compare(String o1, String o2){
        return String.valueOf(o1.split(";")[1]).compareTo(String.valueOf(o2.split(";")[1]));

    }


}
