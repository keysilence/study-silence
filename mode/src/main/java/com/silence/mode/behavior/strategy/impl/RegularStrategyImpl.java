package com.silence.mode.behavior.strategy.impl;

import com.silence.mode.behavior.strategy.StrategyInterface;

/**
 * Created by Silence on 2018/6/20.
 */
public class RegularStrategyImpl implements StrategyInterface {

    @Override
    public Double computedValue(Double price) {

        Double value = price * 1;
        return value;

    }

}
