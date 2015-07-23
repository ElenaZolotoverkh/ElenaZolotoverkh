package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here вывести четные числа
        int b = 0;
        while ( b < 1000){
            b= b+2;
            System.out.println(b);
        }
        //самодеятельность
        int c = 0;
        int s = 0;

        while ( s < 20 ){
            c = c + 1;
            s = s + c;

            System.out.println(s);
        }
        //вывести числа 0 1 12 3 5 8 13 21...2020 Последовательность Фибоначчи
        int q1 = 0, q2 = 1, q3 = 0, q4 = 0;
        while ( q4 < 20){
            System.out.print(q1 + " ");
            q3 = q1;
            q1 = q2;
            q2 = q1 + q3;
            q4 = q4 + 1;
        }
        for (int w = 0; w < 10; w = w + 5){
            System.out.println(w);
        }
        for (int z1 = 0, z2 = 1, z3 = 0,z4 = 0; z4 < 20; z4 =z4+1){
            System.out.println(z1);
            z3 = z1;
            z1 = z2;
            z2 = z1 + z3;
        }
        //Вывести Hello class 1001 раз
        int f = 0;
        for (String v = "Hello Class"; f < 1001; f = f+1){
            System.out.println(v);
        }
        //int i=0;
        int[] m ={1,2,3,4,5,6,7,8,9,10,11};
        for (int i= 0; i<12;i=i+1){
            if (m[i] == 8){
                break;
            }
            System.out.println(m[i]);
        }

        //System.out.println();
// вывести числа с массива исключая 6
        int[] m2 ={1,2,3,4,5,6,7,8,9,10,11};
        for (int i= 0; i<12;i=i+1){
            if (m2[i]==6){
                continue;
            }
            System.out.println(m2[i]);
        }
        //HW
        for (int t = 0; t < 1000; t = t+1){
            if (t%4){
                continue;
            }
            System.out.println(t%4);
        }
    }

}
