/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GettingInputFromUser;

import java.util.Scanner;

/**
 *
 * @author mohammed
 */
public class GettingInputFromUser {

    public static void main(String[] args) {
        // getting input from user using scanner
        Scanner scan = new Scanner(System.in);
        // getting integer from user and print it
        System.out.println("Please Enter an Integer number");
        int num = scan.nextInt();
        System.out.println(num);

        // getting Float from user and print it
        System.out.println("Please Enter a Float number");
        float floatNumber = scan.nextFloat();
        System.out.println(floatNumber);

        // getting Double from user and print it
        System.out.println("Please Enter a Double number");
        double doubleNumber = scan.nextDouble();
        System.out.println(doubleNumber);

        // getting String from user and print it
        System.out.println("Please Enter one String");
        String singleString = scan.next();
        System.out.println(singleString);

        // getting Sentence from user and print it
        System.out.println("Please Enter Sentence");
        String sentenceString = scan.nextLine();
        System.out.println(sentenceString);

        // getting single char from user and print it 
        System.out.println("Please Enter charachter");
        char charachter = scan.next().charAt(0);
        System.out.println(charachter);

    }

}
