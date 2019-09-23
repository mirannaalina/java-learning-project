package exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyMethods {

    protected static String fileName = "file.csv";

    protected static List<String> date = new ArrayList<String>();
    protected static List<String> title = new ArrayList<String>();



    public static void ReadFileCSV(){

        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                 String data = inputStream.next();
                System.out.println(data);
            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void orderAScByCreationDate(){

        Collections.sort(date, new AgeComparator());

        System.out.println("Ascendent creation date : ");

        for (String cont : date) {
            System.out.println(cont);
        }
//bad implemenation( Still working on it)
    }

    public static void orderDescByCreationDate(){

        Collections.sort(date, new AgeDescendent());
//bad implementation( Still working on it)
        System.out.println("Descendent creation date : ");
        for (String cont : date) {
            System.out.println(cont);
        }

    }
    public static void orderAlphabeticallyByTitle(){

// no implementation yet
        System.out.println("Alphabetically By Title: ");
    }
}
