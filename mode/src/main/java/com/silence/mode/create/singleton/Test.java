package com.silence.mode.create.singleton;

import com.silence.mode.create.singleton.lazy.LazySingleton;
import com.silence.mode.create.singleton.staticinternal.StaticInternalSingleton;

/**
 * Created by Silence on 2018/2/1.
 */
public class Test {

    public static void main(String[] args) {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);
        lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton);

        StaticInternalSingleton staticInternalSingleton = StaticInternalSingleton.getInstance();
        System.out.println(staticInternalSingleton);
        staticInternalSingleton = StaticInternalSingleton.getInstance();
        System.out.println(staticInternalSingleton);

    }

}
