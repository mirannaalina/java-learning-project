package exercice1;//I saw the package row just in the end, and I couldn't modify all the paths, just the end (Sorry)

import java.util.Scanner;

import static exercice1.MyMethods.*;

public class Main {
    public static void main(String[] args) {

        ReadFileCSV();

        System.out.println("*******************************************************");

        System.out.println("Choose what you want to perform :");

        System.out.println("1. orderAscByCreationDate\n" +
                "2. orderDescByCreationDate\n" +
                "3. orderAlphabeticallyByTitle");

        Scanner sc = new Scanner(System.in );

        int choose = sc.nextInt();

        switch (choose){
            case 1 :
                orderAScByCreationDate();
                break;
            case 2 :
                orderDescByCreationDate();
            case 3 :
                orderAlphabeticallyByTitle();
        }


    }
}
