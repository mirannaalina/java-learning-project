package exercice1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MyMethods {

    protected static String fileName = "file.csv";


    //array-ul cu intreg continutul
    protected static List<String> date = new ArrayList<String>();



    //array-uri din listele mai mici
    protected static List<String> creationdate = new ArrayList<String>();
    protected static List<String> titles = new ArrayList<String>();



    public static void ReadFileCSV(){

        File file = new File(fileName);
        try {
            Scanner inputStream = new Scanner(file);
            while(inputStream.hasNext()){
                 String data = inputStream.next();

                 //data.split(";");
                 String dateString = data.substring(data.indexOf(';')+1);
                 String titleString = data.substring(data.indexOf(';')+2);

                System.out.println(data);
                date.add(data);
                creationdate.add(dateString);
                titles.add(titleString);

            }
            inputStream.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void orderAScByCreationDate(){

        Collections.sort(creationdate, new AgeComparator());

        System.out.println("Ascendent creation date : \n");

        for (String cont : creationdate) {
            System.out.println(cont);
        }

    }

    public static void orderDescByCreationDate(){

        Collections.sort(creationdate, new AgeDescendent());

        System.out.println("Descendent creation date : \n");

        for (String cont : creationdate) {
            System.out.println(cont);
        }

    }
    public static void orderAlphabeticallyByTitle(){

        Set<String> s = new TreeSet<String>(titles);

        System.out.println("Alphabetically By Title: \n");

        for(String alp : s){
            System.out.println(alp);
        }

    }
}
