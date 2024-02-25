package com.test.JavaBasics;
public class StringMethods {
    
    public static void main(String args[]){
    String str = "   Java Programming   ";
    
    int len = str.length();
//System.out.println(len);
        String p = str.toLowerCase();
       // System.out.println(p);
       String up =  str.toUpperCase(); //new obj will be created and returns in Upper case
       //System.out.println(up);

       String trimming = str.trim();
       System.out.println(trimming);

       String str2 = "My Name is Mani";
       System.out.println(str2.substring(11));
       System.out.println(str2.substring(3,15));
       
    String  str3 =  str2.replace('e', 'o');
       System.out.println(str3); //after replacement it will give new string
        String str4 = "www.abc.org";
        System.out.println(str4.startsWith("www"));
        //System.out.println(str4);
       System.out.println(str4.endsWith("org"));
       //charAt
       System.out.println(str4.charAt(6));
       System.out.println(str4.indexOf("."));
       System.out.println(str4.indexOf("ab"));  //index of that string
       System.out.println(str4.indexOf(".", 4)); //if i want to find 2nd .



    }

}
