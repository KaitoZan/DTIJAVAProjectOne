package com.sau.tech;

public class MyClass01 {
    public static void met1() {
        System.out.println(111);
    }

    public static void main(String[] args) {
        System.out.println("AAAA");
        met1();
        met2();
        System.out.println("BBBB");
    }

    public static void met2() {
        System.out.println(222);
    }
}
