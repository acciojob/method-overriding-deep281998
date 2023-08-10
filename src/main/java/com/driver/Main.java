package com.driver;

public class Main {

    public static class A {

        public String meth()
        {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {

        @Override
        public String meth(){

            return "Method is overridden in Extended class B";
        }
    }


    public static void main(String agrs[]) {

        B objB = new B();

        System.out.print(objB.meth());
    }
}