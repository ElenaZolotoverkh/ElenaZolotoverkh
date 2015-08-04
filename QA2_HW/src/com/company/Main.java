package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 20;
        int b = a + 5;
        String s = "Test String";
        System.out.println(a);
        System.out.println(s + a);
        System.out.println(a + s);
        System.out.println(a==b);
        System.out.println(a < b);
        System.out.println(true && false);
        System.out.println(a == 20);
        System.out.println(true||false);
        int c = b + a;
        a = 0;
        System.out.println(c== (b+a));
        s = "0";
        //System.out.println(a == s);
       // System.out.println(s == 0);
        System.out.println(s == "0");
        int[] i = {1,2,3,4,5,5,5,1};
        System.out.println(i[1] - i[4]);
        i[4] = i[6];
        System.out.println(i[4]);
        i[0] = i[1]*i[2];
        System.out.println(i[0]);
        System.out.println(s + s + s + s + s);








    }
}
