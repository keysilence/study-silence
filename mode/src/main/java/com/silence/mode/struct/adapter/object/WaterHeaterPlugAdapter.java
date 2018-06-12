package com.silence.mode.struct.adapter.object;

import com.silence.mode.struct.adapter.object.impl.WaterHeaterAmericaPlug;

/**
 * Created by Silence on 2018/6/6.
 */
public class WaterHeaterPlugAdapter implements ChinaPlug {

    private WaterHeaterAmericaPlug europePlug;

    public WaterHeaterPlugAdapter(WaterHeaterAmericaPlug europePlug) {
        this.europePlug = europePlug;
    }

    @Override
    public void workForChina(int voltage) {

        voltage = voltage / 2;
        europePlug.workForAmerica(voltage);
        System.out.println("变压器输出减半电压！接入电压变为：" + voltage + "V");

    }

}
