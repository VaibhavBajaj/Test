package com.keepkoding;

/**
 * Created by vaibhavbajaj on 2/10/17.
 */
public class Muhu extends Main {

    public void printHello() {
        super.printHello();
        System.out.println(" Blaha");
    }

    public static void main(String args[]) {
        Muhu muhu = new Muhu();
        muhu.printHello();
    }
}
