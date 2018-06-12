package com.silence;

import com.silence.mode.behavior.observer.Interviewee;
import com.silence.mode.behavior.observer.impl.Company;
import com.silence.mode.behavior.observer.impl.IntervieweeA;
import com.silence.mode.behavior.observer.impl.IntervieweeB;

/**
 * 测试类
 *
 */
public class App  {

    public static void main( String[] args ) {

        Interviewee intervieweeA = new IntervieweeA();
        Interviewee intervieweeB = new IntervieweeB();

        Company company = new Company();
        company.addInterviewee(intervieweeA);
        company.addInterviewee(intervieweeB);

        company.sendMessage();

    }

}
