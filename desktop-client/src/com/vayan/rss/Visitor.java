package com.vayan.rss;

import java.util.Objects;

/**
 * Created by yann on 25/11/2014.
 */
public interface Visitor {
    public String getName();
    public Object getData();
    public Object getOneData(int index);
    public int getSize();
    public int getIndexofChild(Object o);
}
