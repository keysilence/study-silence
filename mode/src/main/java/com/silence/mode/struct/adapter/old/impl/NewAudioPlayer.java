package com.silence.mode.struct.adapter.old.impl;

import com.silence.mode.struct.adapter.old.MediaPlayer;

/**
 * Created by Silence on 2018/6/5.
 */
public class NewAudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("播放音频文件:" + fileName);
        } else {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }

    }

}
