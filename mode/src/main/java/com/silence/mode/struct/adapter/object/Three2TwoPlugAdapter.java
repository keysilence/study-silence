package com.silence.mode.struct.adapter.object;

/**
 * Created by Silence on 2018/6/12.
 */
public class Three2TwoPlugAdapter implements TwoPhasePlug {

    private ThreePhasePlug threePhasePlug;

    public Three2TwoPlugAdapter(ThreePhasePlug threePhasePlug) {

        this.threePhasePlug = threePhasePlug;

    }

    @Override
    public void workWithTwoPlug() {

        System.out.println("三相->两相转换器！");

        threePhasePlug.workWithThreePlug();

    }

}
