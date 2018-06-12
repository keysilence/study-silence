package com.silence.forkjoin;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Silence on 2018/1/23.
 */
public class MyForkJoinTask extends RecursiveTask<Integer> {
    private final int threadSize = 2;
    private int start, end;
    public MyForkJoinTask (int start, int end) {
        this.start = start;
        this.end = end;
    }
    protected Integer compute() {
        // TODO Auto-generated method stub
        int sum = 0;
        if ((end - start) < threadSize) {
            for(int i = start; i <= end; i++) {
                sum += i;
            }
        } else {
            int middle = (start + end) / threadSize;
            MyForkJoinTask firstTask = new MyForkJoinTask(start, middle);
            MyForkJoinTask secondTask = new MyForkJoinTask(middle + 1, end);
            firstTask.fork();
            secondTask.fork();
            int firstResult = firstTask.join();
            int secondResult = secondTask.join();
            sum = firstResult + secondResult;
        }
        return sum;
    }

}
