package org.example;

import java.util.Scanner;

public class ExceptionActivity {

    public static void main(String[] args) {

        try {
            int x = 0;
            int y = 2;
            System.out.println(10 / 2);

            System.out.println(y / x);

            System.out.println(6 / 2);

            // happy path - all this executes if no exception thrown
        } catch (Exception e) {

            // sad path - exception thrown
            e.printStackTrace();
        }

        // try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // Do something here
            String Bob = null;
            System.out.println(Bob.length());
        } catch (NullPointerException e) {

            System.out.println("Unexpected Null Exception");
            // we'll catch the NullPointerException here and handle it differently than other exceptions
        } catch (Exception e) {

            e.printStackTrace();
        }
// do more stuff

        try {

            System.out.println(12 / 0);
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("It be like that");
        }
// do yet more stuff

        try {
            // do something we don't expect to throw exceptions
            System.out.println("hello world");
        } finally {
            System.out.println("Sup");
        }
// more stuff here


        // java 7 multi-try-catch
        try {
            String Bob = null;
            System.out.println(Bob.length());
        } catch (ArithmeticException | NullPointerException e) {
            // when either of the exceptions are thrown, do this
            e.printStackTrace();
        }
// yep, you guessed it - more stuff

        // try-with-resources
        // try-with-resources
        try (Scanner scanner1 = new Scanner(System.in)) {
            // do something with scanner1
            String name;
            System.out.println("Enter your Name");
            name = scanner1.next();
            System.out.println("Your Name is " + name);


        }
    }

    }

