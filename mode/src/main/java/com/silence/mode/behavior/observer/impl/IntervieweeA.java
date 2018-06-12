package com.silence.mode.behavior.observer.impl;

import com.silence.mode.behavior.observer.Interviewee;

/**
 * Created by Silence on 2018/1/31.
 */
public class IntervieweeA implements Interviewee {

    private final static String name = "求职者A";

    @Override
    public void getMessage(String message) {
        System.out.println(name + "接到了公司的面试邀请！" + message);
    }

}
