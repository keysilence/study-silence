package com.silence.mode.struct.adapter.old.impl;

import com.silence.mode.struct.adapter.old.MediaPlayer;

/**
 * Created by Silence on 2018/6/5.
 */
public class AudioPlayer implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("播放音频文件:" + fileName);
    }

}
