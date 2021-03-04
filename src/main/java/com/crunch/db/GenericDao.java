package com.crunch.db;

import com.crunch.util.GymCollection;

/**
 * A dao contract to determine functionality in the GymDao objects.
 * @param <T> The class used for this dao object.
 * @param <I> The primary key used by the class.
 */
public interface GenericDao<T, I> {

    //save an instance to the db
    int save(T t);

    //select an object by its primary key
    T getById(I id);

    //gather all objects in the db
    GymCollection getAll();

    //delete an object from the db
    boolean remove(I id);

    //update an object in the db
    boolean update(T t);

    //update all records in a table that correspond to the objects inside the GymCollection argument
    int updateAll(GymCollection collection);
}
