package com.silence.mode.struct.adapter.object;

import com.silence.mode.struct.adapter.object.impl.FreezerAmericaPlug;
import com.silence.mode.struct.adapter.object.impl.FreezerChinaPlug;

/**
 * Created by Silence on 2018/6/6.
 */
public class Test {

    public static void main(String[] args) {

        int voltage = 220;

        FreezerAmericaPlug europePlug = new FreezerAmericaPlug();

        ChinaPlug chinaPlug = new FreezerChinaPlug();
        chinaPlug.workForChina(voltage);

        ChinaPlug adapterPlug = new FreezerPlugAdapter(europePlug);

        adapterPlug.workForChina(voltage);

    }

}
