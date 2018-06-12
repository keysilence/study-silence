package com.silence.mode.struct.adapter.old.impl;

import com.silence.mode.struct.adapter.old.AdvancedMediaPlayer;
import com.silence.mode.struct.adapter.old.MediaPlayer;

/**
 * Created by Silence on 2018/6/5.
 */
public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {

        if (audioType.equalsIgnoreCase("rmvb")) {
            advancedMediaPlayer = new RmvbPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }

    }

    @Override
    public void play(String audioType, String fileName) {

        advancedMediaPlayer.play(fileName);

    }

}
