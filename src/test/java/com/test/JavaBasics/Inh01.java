package com.test.JavaBasics;
import java.util.*;

public class Inh01 {
    
    // public void sum(int a, int b){
    
    //     int c = a+b;
    //     System.out.println(c);
    // }

    // public static void main(String[] args) {

        //sum of two numbers using scanner class
public static void main(StringCreation[] args){
    Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter two numbers");
        x = sc.nextInt();
        y = sc.nextInt();

        int z = x+y;
        System.out.println("Sum is " +z);
    }
}
