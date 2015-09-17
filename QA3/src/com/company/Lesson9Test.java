package com.company;

import org.junit.Test;
import org.testng.Assert;

/**
 * Created by Elena.Zolotoverkh on 01.09.2015.
 */
public class Lesson9Test {
    @Test
    public void test(){
        Assert.assertEquals(20,10+10);
       // Assert.assertEquals(true, 1==2);

    }

    public static int sumAll(int[] sumAll){
        int sum = 0;
        for(int i=0; i<sumAll.length; i++){
            sum = sum+sumAll[i];
        }
        return sum;
    }

    @Test
    public void test1Passed(){
        Assert.assertEquals(10, sumAll(new int[]{1,4,2,3,0}));

    }

    @Test
    public void test2Failed(){
        Assert.assertEquals(-10, sumAll(new int[]{1,4,2,3,0}));

    }

    @Test
    public void test3Failed(){
        Assert.assertEquals(true, sumAll(new int[]{1,4,2,3,0}));

    }
    @Test
    public void test4Passed(){
        Assert.assertNotEquals(-10, sumAll(new int[]{1,4,2,3,0}));
    }

    @Test
    public void test5Passed(){
        Assert.assertEquals(2*5,sumAll(new int[]{1,4,2,3,0}) );
    }

    @Test
    public void test6Passed(){
        Assert.assertEquals(20/2,sumAll(new int[]{1,4,2,3,0}) );
    }

    @Test
    public void test7Failed(){
        Assert.assertNotEquals(25 % 2, sumAll(new int[]{1, 4, 2, 3, 0}));
    }

    @Test
    public void test8Passed(){
        Assert.assertEquals(210%20,sumAll(new int[]{1,4,2,3,0}));
    }
}
