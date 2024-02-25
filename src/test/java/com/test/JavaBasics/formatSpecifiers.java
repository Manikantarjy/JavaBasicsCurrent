package com.test.JavaBasics;

public class formatSpecifiers {
    public static void main(StringCreation[] args) {
        
   
    int x = 10;
    float y = 3.4f;
    char z = 'M';
     StringCreation str = "Java program";
    // %d - int, %f - float, %c - char, %s - string

    //System.out.printf("Hello %d %f %c \n",x,y,z);
   // System.out.printf("Hello %o %f %c \n",x,y,z); //%o - octal value
   // System.out.printf("Hello %x %f %c \n",x,y,z); //%x - hexa decimal
   // System.out.printf("Hello %e \n", y); //%e - scientific notation
        //System.out.printf("Hello %s \n", str); 
        //what is the use of arg index, we can give at any order and print values.  
    //  System.out.printf("%1$d %1$d %1$d \n", x);  //argument index
    //  System.out.printf("%1$d %2$f %1$d", x,y); //print integer, float and integer values again
     // System.out.printf("%3$s %2$f %1$d", x,y,str);  //even order changed, but it will print values order as per arg index specified
        //flags
       // System.out.printf("%+5d", x);
        //float
      //  System.out.printf("%6.2f",y); // Notation for out of 6(width) digit float print till first 2 digits
        //System.out.printf("%06.2f", y);
        //String
        System.out.printf("%-20s", str); //print after width of 20 places
    }
}   
