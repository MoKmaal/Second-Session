/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author mohammed
 */
public class MainClass {

    public static void main(String[] args) {

        Temprature t1 = new Temprature();
        Temprature t2 = new Temprature();
        t1.setTemp(25);
        t2.setTemp(25);

        boolean check = t1.equals(t2);
        System.out.println(check);
    }
}
