package com.silence.mode.create.builder;

/**
 * Created by Silence on 2018/2/2.
 */
public class Test {

    public static void main(String[] args) {

        ManBuilder manBuilder = new ManBuilder();
        Man man = manBuilder.build();
        System.out.println(man);

    }

}
