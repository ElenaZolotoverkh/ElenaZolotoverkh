package com.company;

/**
 * Created by Elena.Zolotoverkh on 11.08.2015.
 */
public class Quiz6_2 {
    public static void main(String[] args) {
        sayHello();
        // Hello Class!
       // System.out.println(hello());
        // Hello Engineers!
        System.out.println(hello("Friends"));
        // Hello Engineers!
        System.out.println(hello("Friends").equals(hello("Friends")));
        // true
        System.out.println(hello("Friends") == hello("Friends"));
        // false
        //test("Hello Engineers!", hello());
        // Test PASSED.


    }



    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    public static String hello(String friends) {
        return "Hello Engineers!";
    }


    public static void test(String expected, String actual) {
        // Дописать код сюда
      if (expected.equals(actual)){
          System.out.println("Test PASSED.");
      } else {
          System.out.println("Test FAILED");
         // System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
      }

     }
   }





