package com.silence.mode.struct.adapter.inter_face;

/**
 * Created by Silence on 2018/6/12.
 */
public class AbstractFilter implements AnyFilter {

    @Override
    public void init() {
        System.out.println("Default init!");
    }

    @Override
    public void doFilter() {
        System.out.println("Default doFilter!");
    }

    @Override
    public void destroy() {
        System.out.println("Default destroy!");
    }

}