package com.sk.dsa;

public class TailHead {
    static void m1(int l) {
        System.out.println(l);
        if (l > 0) {// 2 1
            m1(l - 1);
            System.out.println(l+"fff3");
        }
    }

    public static void main(String[] args) {

        int x = 2;
        m1(x);

    }

}
