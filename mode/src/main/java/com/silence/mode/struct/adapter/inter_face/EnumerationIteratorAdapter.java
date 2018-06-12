package com.silence.mode.struct.adapter.inter_face;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Silence on 2018/6/5.
 */
public class EnumerationIteratorAdapter implements Iterator {

    Enumeration enumeration;

    public EnumerationIteratorAdapter(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {

    }

}
