package com.company;

/**
 * Created by Admin on 15.09.15.
 */
public class WhyStaticMain {
    public static void main(String[] args){
        System.out.println("WhyStatic.publicStaticVar = "+ WhyStatic.publicStaticVar);
     //System.out.println("WhyStatic.publicStaticVar = "+ WhyStatic.privateStaticVar);


        WhyStatic w = new WhyStatic();
        WhyStatic w2 = new WhyStatic();
        System.out.println("w.publicStaticVar = "+ w.publicNotStaticVar);
        System.out.println("w2.publicStaticVar = "+ w2.publicNotStaticVar);

        w.publicNotStaticVar = 10;
        System.out.println("w.publicStaticVar = "+ w.publicNotStaticVar);
        System.out.println("w2.publicStaticVar = "+ w2.publicNotStaticVar);

        System.out.println("w.publicStaticVar = "+ w.getNotStaticVar());
        System.out.println("w2.publicStaticVar = "+ w2.getNotStaticVar());

}}
