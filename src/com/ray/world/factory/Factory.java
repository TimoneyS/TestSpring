package com.ray.world.factory;

public interface Factory<T> {
    public T create(); 
    public T create(Object...args); 
}
