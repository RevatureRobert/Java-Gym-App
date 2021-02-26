package com.crunch.util;

import com.crunch.model.User;

import java.util.Collection;
import java.util.TreeSet;

/**
 * should have
 * No duplicates (implementation detail)
 * Do not care about the order (implementation detail)
 * index should always point to the last valid object
 * No gaps
 * Resizable with conditions
 * View all elements of the collection
 *
 */

/*

        TODO: refactor and give generics
 */

public abstract class GymCollection<T> {

    /**
     * Optional size number for non expandable subclasses
     */
    protected int maxSize;

    public abstract T get(T o);

    public abstract void add(T u) throws Exception;

    public abstract int size();

    public abstract void remove(T o);

    public abstract T next();

    public abstract T previous();

    public abstract String toString();

    abstract boolean isEmpty();

    protected abstract void clear();

}
