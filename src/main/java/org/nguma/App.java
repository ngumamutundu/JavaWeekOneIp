package org.nguma;

import java.io.Console;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        System.out.print("Encode-(E) OR Decode-(D): ");

        String process = scanner.nextLine();



        System.out.print("Enter your message here: ");

        String message = scanner.nextLine().toUpperCase();



        System.out.print("Enter the key: ");

        int cipherKey = scanner.nextInt();



        if (process.equalsIgnoreCase("E") || process.equalsIgnoreCase("ENCODE")){

            String output = Encoding.encode(message, cipherKey);

            System.out.print("Encoded text is: ".concat( output) );

        }



        else if (process.equalsIgnoreCase("D") || process.equalsIgnoreCase("DECODE")){

            String results = Decoding.decode(message, cipherKey);

            System.out.print("Decoded text is: ".concat(results));

            scanner.nextLine();

        }



        else

            System.out.print("REPLY WITH (E TO ENCODE) AND (D TO DECODE)");

    }
}