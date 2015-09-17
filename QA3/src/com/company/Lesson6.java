package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by admin on 04.08.15.
 */
public class Lesson6 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.size());//узнать длину списка
        a.add(10);//добавить значение в список
        System.out.println(a.size());
        a.add(1);
        a.add(5);
        System.out.println(a.get(1));//достать значение со списка
        System.out.println(a.get(2));
        a.remove(0);//удалить значение со списка
        System.out.println(a.size());
        Integer []a1 ={1, 2, 10, 20};
        a.addAll(Arrays.asList(a1));
        System.out.println(a);
    }


}
