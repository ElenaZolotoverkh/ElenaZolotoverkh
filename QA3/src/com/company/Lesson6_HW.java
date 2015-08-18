package com.company;

import java.util.ArrayList;

/**
 * Created by Elena.Zolotoverkh on 06.08.2015.
 */
public class Lesson6_HW {
    public static void main(String[] args){

        ArrayList<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("b");
        print(s);

        ArrayList<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        f.add("d");
        f.add("d");

        System.out.println(isListsEqual(s, f));

        ArrayList<String> s1 = new ArrayList<String>();
        ArrayList<String> s2 = new ArrayList<String>();
        System.out.println(isListsEqual(s1, s2));

        String[] a = {"a", "b", "c", "d", "b"};
        print(a);

    }
        public static void print(ArrayList s){

            System.out.println(s);
        }

        public static boolean isListsEqual(ArrayList s, ArrayList f ){
            if (s.equals(f)){
                return true;
            } else
                return false;

        }
    public static void print(String[] a) {
        // Тут дописать тело функции.

       for  ( int i = 0; i<5; i += 1){
        System.out.print(a[i]);
        }

    }



}


