package com.company;

/**
 * Created by Admin on 15.09.15.
 */
public class Door {
    public String calor = "Wood";

    public String closed = "Closed";
    public static String made = "China";
    private static String state = "Error";





    public String state(){
        return closed;

    }

    public void open(){
        closed = "Open";


    }
}
