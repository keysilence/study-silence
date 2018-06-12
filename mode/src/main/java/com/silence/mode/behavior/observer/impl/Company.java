package com.silence.mode.behavior.observer.impl;

import com.silence.mode.behavior.observer.Interviewee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silence on 2018/1/31.
 */
public class Company {

    private List<Interviewee> list = new ArrayList<Interviewee>();

    public void addInterviewee(Interviewee interviewee) {

        list.add(interviewee);

    }

    public void sendMessage() {

        for (Interviewee interviewee : list) {
            interviewee.getMessage("恭喜你！");
        }

    }

}
