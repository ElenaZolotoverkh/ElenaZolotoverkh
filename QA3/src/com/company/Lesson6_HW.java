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
        print(s);

        ArrayList<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        //  f.add("d");

        System.out.println(isListsEqual(s, f));
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


}


