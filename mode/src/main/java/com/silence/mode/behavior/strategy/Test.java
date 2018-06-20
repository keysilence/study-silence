package com.silence.mode.behavior.strategy;

import com.silence.mode.behavior.strategy.impl.GoldStrategyImpl;
import com.silence.mode.behavior.strategy.impl.RegularStrategyImpl;
import com.silence.mode.behavior.strategy.impl.SilverStrategyImpl;

/**
 * Created by Silence on 2018/6/20.
 */
public class Test {

    public static void main(String[] args) {

        Context context = new Context(new GoldStrategyImpl());
        System.out.println("金牌会员价格：" + context.computedValue(100.0));

        context = new Context(new SilverStrategyImpl());
        System.out.println("银牌会员价格：" + context.computedValue(100.0));

        context = new Context(new RegularStrategyImpl());
        System.out.println("普通会员价格：" + context.computedValue(100.0));

    }

}
