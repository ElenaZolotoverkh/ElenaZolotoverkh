package com.company;

public class Main {

    public static int f(){
        return 1000;
    }



    public static void main(String[] args) {
        // write your code here
        int i = 1000;
        int a = 20;
       // int b = a + 5;
        //String s = "Test String";
        System.out.println();
        for (int u = 2000; u > 918; u = 918) {
            System.out.print("continue");


        }
        String t = "Hello Class";
        System.out.println(t);
        String ts = ", and Student!";
        System.out.println(t + ts);

        String [] u = {"0", "1", "Under key one but three", "3", "4", "Under key five"};
        System.out.println(u[5]);
        System.out.println(u[3-1]);

        for (int x = 8; x < 11; x++) {
            System.out.println(x);
        }
        String [] s = {"How", "are", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }

        int b = 25;
        int[] m = {10, 20, 25, 30};
        int i = 0;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
        int d = 10;
        int[] n = {10, 20, 25, 30};
        int j = 0;
        while (j < 4) {
           if (n[j] == d) {
                j++;
                continue;
           }
           System.out.println(n[j]);
            j++;
      }


    }}


