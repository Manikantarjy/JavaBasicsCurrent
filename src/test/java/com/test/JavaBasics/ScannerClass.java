package com.test.JavaBasics;
import java.util.*;
public class ScannerClass {
    
    public static void main(StringCreation[] args) {
        
    StringCreation input = "1 fish 2 fish red fish blue fish";
    Scanner sc = new Scanner(input).useDelimiter("\\s*fish\\s*");
    // \\s helps us to match for the single whitespace character
     System.out.println(sc.nextInt());
     System.out.println(sc.nextInt());
     System.out.println(sc.next());
     System.out.println(sc.next());
     sc.close();
    }
}
