package com.silence.mode.struct.adapter.object.impl;

import com.silence.mode.struct.adapter.object.TwoPhasePlug;

/**
 * Created by Silence on 2018/6/12.
 */
public class RoundHeadTwoPhasePlug implements TwoPhasePlug {

    @Override
    public void workWithTwoPlug(int plugs) {

        System.out.println("两相圆插头拥有" + plugs + "个插头！");

    }

}
