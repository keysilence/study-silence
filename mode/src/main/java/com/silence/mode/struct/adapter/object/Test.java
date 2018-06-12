package com.silence.mode.struct.adapter.object;

import com.silence.mode.struct.adapter.object.impl.WaterHeaterAmericaPlug;
import com.silence.mode.struct.adapter.object.impl.WaterHeaterChinaPlug;

/**
 * Created by Silence on 2018/6/6.
 */
public class Test {

    public static void main(String[] args) {

        int voltage = 220;

        WaterHeaterAmericaPlug europePlug = new WaterHeaterAmericaPlug();

        ChinaPlug chinaPlug = new WaterHeaterChinaPlug();
        chinaPlug.workForChina(voltage);

        ChinaPlug adapterPlug = new WaterHeaterPlugAdapter(europePlug);

        adapterPlug.workForChina(voltage);

    }

}
