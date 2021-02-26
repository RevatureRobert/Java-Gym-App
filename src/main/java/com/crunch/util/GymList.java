package com.crunch.util;

import com.crunch.model.User;

public abstract class GymList<T> extends GymCollection<T>{

    public abstract void order();

    public abstract int indexOf(User u);
}
