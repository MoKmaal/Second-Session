/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsMethods;

/**
 *
 * @author mohammed
 */
public class StringsMethods {
    
    public static void main(String[] args) {
        String x = "I love Java";

        // replace char or string with char or string
        x = x.replace("I", "We");
        System.out.println(x);

        // getting index of J char in java
        int index = x.indexOf("J");
        System.out.println("Index of J is " + index);

        // getting index of first e char in java
        int index1 = x.indexOf("e");
        System.out.println("Index of e is " + index1);

        // getting index of last e char in java
        int index2 = x.lastIndexOf("e");
        System.out.println("Index of last e is " + index2);

        // return love only
        // getting first index of space
        // getting last index of space
        int ind1 = x.indexOf(" ");
        int ind2 = x.lastIndexOf(" ");
        // return substring
        x = x.substring(ind1+1, ind2);
        
        // add C# at the last of sentence
        x = x.concat(" C#");
        System.out.println(x);
        
    }
    
}
