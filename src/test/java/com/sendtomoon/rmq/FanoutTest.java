package com.sendtomoon.rmq;

import org.junit.Test;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FanoutTest {

    @Test
    public void test1() {
        com.sendtomoon.rmq.fanout.Produce p = new com.sendtomoon.rmq.fanout.Produce();
        com.sendtomoon.rmq.fanout.Consumer1 c1 = new com.sendtomoon.rmq.fanout.Consumer1();
        Executor ex = Executors.newFixedThreadPool(10);
        ex.execute(() -> {
            p.p();
        });
        Executor ex2 = Executors.newFixedThreadPool(10);
        ex2.execute(() -> {
            c1.c();
        });

        while (true) {

        }
    }
}
