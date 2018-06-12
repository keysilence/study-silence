package com.silence.mode.create.singleton.lazy;

/**
 * Created by Silence on 2018/2/1.
 */
public class LazySingleton {

    private static LazySingleton lazySingleton;

    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
