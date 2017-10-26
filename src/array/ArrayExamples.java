/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author mohammed
 */
public class ArrayExamples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /**
         * initializing array and print it
         */
        // initializing array
        int arr[] = {5, 32, 42, 7, 1, 8, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("array index number " + i + " has value = " + arr[i]);

        }

        /////////////////////////////////////////////////////////////
        System.out.println("");
        System.out.println("");
        // initializing array

        int x[] = {1, 2, 3, 4, 5};
        int y[] = {6, 7, 8, 9, 10};
        // assign address not value
        y = x;
        y[0] = -1;
        System.out.println("array 'X' index number 0 has value = " + x[0]);
        System.out.println("");
        System.out.println("");

        //////////////////////////////////////////////////////
        // create array with determining its size
        int[] array = new int[5];
        array[0] = 56;
        array[1] = 45;
        array[2] = 76;
        array[3] = 61;
        array[4] = 8;
        // use for each
        for (int i : array) {
            System.out.println(i);

        }
    }

}
