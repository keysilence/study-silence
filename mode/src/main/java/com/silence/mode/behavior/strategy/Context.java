package com.silence.mode.behavior.strategy;

/**
 * Created by Silence on 2018/6/20.
 */
public class Context {

    private StrategyInterface strategy;

    public Context(StrategyInterface strategyInterface) {
        this.strategy = strategyInterface;
    }

    public Double computedValue(Double price) {

        return strategy.computedValue(price);

    }

}
