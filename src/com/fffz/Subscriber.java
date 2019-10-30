package com.fffz;

/**
 * Created by fffz on 2016/10/15.
 */
public abstract class Subscriber<T> {

    public abstract void onNext(T t);

}
