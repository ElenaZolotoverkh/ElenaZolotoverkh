package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int g = -113;
        int sec = 1;
        int r = g*sec;
        System.out.println(r);

        boolean oper = false;
        int a = 0;
        int b = -200;
        if (oper==true){
            System.out.println(a+b);
        } else {
            System.out.println(a-b);
        }
        boolean anti = true;
        if(anti == true){
            System.out.println("false");
        }else{
            System.out.println("true");
        }

        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 7;
        System.out.println(strings[w1-1] + " " + strings[w2-1]);

        }


    }

