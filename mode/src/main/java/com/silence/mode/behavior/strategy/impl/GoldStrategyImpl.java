package com.silence.mode.behavior.strategy.impl;

import com.silence.mode.behavior.strategy.StrategyInterface;

/**
 * Created by Silence on 2018/6/20.
 */
public class GoldStrategyImpl implements StrategyInterface {

    @Override
    public Double computedValue(Double price) {

        Double value = price * 0.6;
        return value;

    }

}
