package com.silence.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

/**
 * Created by Silence on 2018/1/23.
 */
public class TestForkJoin {

    public static void main(String[] args) throws Exception {
        ForkJoinPool pool = new ForkJoinPool();
        MyForkJoinTask task = new MyForkJoinTask(1, 100);
        Future<Integer> result = pool.submit(task);
        System.out.println("result is" + result.get());

        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        System.out.println("result2 is" + sum);
    }

}
