package com.silence.mode.create.singleton.staticinternal;

/**
 * Created by Silence on 2018/2/1.
 */
public class StaticInternalSingleton {

    private static class StaticInternalSingletonHolder {

        private static StaticInternalSingleton INSTANCE = new StaticInternalSingleton();

    }

    public static StaticInternalSingleton getInstance() {

        return StaticInternalSingletonHolder.INSTANCE;

    }
    
}
