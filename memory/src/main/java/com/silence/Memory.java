package com.silence;

import org.openjdk.jol.info.ClassLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Silence on 2019/11/1.
 */
public class Memory {

    public static void main(String[] args) {

        new Memory().printMemorySize(new TestBean());

        List<String> list = new ArrayList<>();
        list.add("111111111111111111111111111111111111111111111111");
        list.add("222222222222222222222222222222222222222222222222");
        new Memory().printMemorySize(new TestBean(list, 1111111111, "哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈"));

    }

    public void printMemorySize(Object object) {

        System.out.println(ClassLayout.parseInstance(object).toPrintable());

    }

}
