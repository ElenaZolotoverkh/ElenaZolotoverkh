package com.company;

/**
 * Created by Admin on 15.09.15.
 */

//public and private | static not static
public class WhyStatic {
    public static int publicStaticVar = 0;
    public int publicNotStaticVar = 1;
    private static int privateStaticVar = 2;
    private int privateNotStaticVar = 3;

    public static int getStaticVar(){
        return privateStaticVar;
    }

    public int getNotStaticVar(){
        return privateNotStaticVar;
    }


}
