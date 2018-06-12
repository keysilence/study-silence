package com.silence.mode.struct.adapter.old;

import com.silence.mode.struct.adapter.old.impl.NewAudioPlayer;

/**
 * Created by Silence on 2018/6/5.
 */
public class Test {

    public static void main(String[] args) {

        NewAudioPlayer newAudioPlayer = new NewAudioPlayer();
        newAudioPlayer.play("mp3", "You Never Can Tell.mp3");
        newAudioPlayer.play("mp4", "复仇者联盟3.mp4");
        newAudioPlayer.play("rmvb", "王者归来.rmvb");

    }

}
