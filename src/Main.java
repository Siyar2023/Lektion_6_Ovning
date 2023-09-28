
//Felhantering
//Hello

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 100, 1000};

        System.out.println("Before crash");

       try {
           //TRY to execute code
           System.out.println("inside - TRY");
           System.out.println(2/0);

       }
       catch (Exception error){
           System.out.println("inside - CATCH");


          error.printStackTrace();
       }

            System.out.println("After crash");


    }
}

