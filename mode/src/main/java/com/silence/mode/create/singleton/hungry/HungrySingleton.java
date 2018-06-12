package com.silence.mode.create.singleton.hungry;

/**
 * Created by Silence on 2018/2/1.
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

}
