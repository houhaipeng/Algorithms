package com.hhp;


import java.util.LinkedList;
import java.util.Queue;

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

    @Test
    public void testQueue() {
        //add()和offer(),remove()和poll(),element()和peek()
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        //peek()取出队首元素，不删除队首元素
        Integer peek = queue.peek();
        System.out.println(peek);
        System.out.println(queue);
        //poll()取出队首元素，删除队首元素
        Integer poll = queue.poll();
        System.out.println(poll);
        System.out.println(queue);
    }
}
