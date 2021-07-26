package com.hhp;


import org.junit.Test;

public class TestJava {

    @Test
    public void test() {
        String str = "iosdjfi";
        String str2 = " ";
        System.out.println(str.contains(str2));
    }

    @Test
    public void testFor() {
        for (int i = 0; i < 10; ++i) {
            System.out.println(i);
        }
    }
}
