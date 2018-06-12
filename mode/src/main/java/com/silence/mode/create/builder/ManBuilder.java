package com.silence.mode.create.builder;

/**
 * Created by Silence on 2018/2/2.
 */
public class ManBuilder {

    private Man man;

    public ManBuilder() {
        man = new Man();
    }

    public void buildHead() {
        man.setHead("男人的头");
    }

    public void buildBody() {
        man.setBody("男人的身体");
    }

    public void buildFoot() {
        man.setFoot("男人的脚");
    }

    public Man build() {
        buildHead();
        buildBody();
        buildFoot();
        return man;
    }

}
