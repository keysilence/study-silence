package com.silence.mode.create.singleton.dubblelock;

/**
 * Created by Silence on 2018/2/1.
 */
public class DubbleLockSingleton {

    private static volatile DubbleLockSingleton dubbleLockSingleton;

    public static DubbleLockSingleton getInstance() {
        if (dubbleLockSingleton == null) {
            synchronized (DubbleLockSingleton.class) {
                if (dubbleLockSingleton == null) {
                    dubbleLockSingleton = new DubbleLockSingleton();
                }
            }
        }
        return dubbleLockSingleton;
    }

}
