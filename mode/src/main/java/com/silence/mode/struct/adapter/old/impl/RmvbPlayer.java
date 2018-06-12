package com.silence.mode.struct.adapter.old.impl;

import com.silence.mode.struct.adapter.old.AdvancedMediaPlayer;

/**
 * Created by Silence on 2018/6/5.
 */
public class RmvbPlayer implements AdvancedMediaPlayer {

    @Override
    public void play(String fileName) {
        System.out.println("播放Rmvb文件:" + fileName);
    }

}
