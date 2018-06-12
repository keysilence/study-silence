package com.silence.mode.struct.adapter.object.impl;

import com.silence.mode.struct.adapter.object.ChinaPlug;

/**
 * Created by Silence on 2018/6/6.
 */
public class WaterHeaterChinaPlug implements ChinaPlug {

    @Override
    public void workForChina(int voltage) {

        System.out.println("热水器中国版本的插头！接入电压：" + voltage + "V");


    }

}
