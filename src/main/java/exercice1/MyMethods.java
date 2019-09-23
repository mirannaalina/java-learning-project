package exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyMethods {

    protected static String fileName = "file.csv";

    protected static List<String> date = new ArrayList<String>();

    //liste mai mici cu valorile din creationdate si title (Array list, not a simple array)


    protected static List<String> creationdate =date.subList(2,3);
   // protected static String [] title =


    public static void ReadFileCSV(){

        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                 String data = inputStream.next();
                System.out.println(data);
                date.add(data);

            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void orderAScByCreationDate(){

        Collections.sort(date, new AgeComparator());

        System.out.println("Ascendent creation date : \n");

        for (String cont : date) {
            System.out.println(cont);
        }

    }

    public static void orderDescByCreationDate(){

        Collections.sort(date, new AgeDescendent());

        System.out.println("Descendent creation date : \n");

        for (String cont : date) {
            System.out.println(cont);
        }

    }
    public static void orderAlphabeticallyByTitle(){

        Set<String> s = new TreeSet<String>(date);

        System.out.println("Alphabetically By Title: \n");

        for(String alp : s){
            System.out.println(alp);
        }

    }
}
