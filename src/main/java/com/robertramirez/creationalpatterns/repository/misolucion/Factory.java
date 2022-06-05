package com.robertramirez.creationalpatterns.repository.misolucion;

public class Factory<T> implements AbstractFactory<T> {
    @Override
    public T createRepository(Class<T> argument) throws IllegalAccessException, InstantiationException {
        return argument.newInstance();
    }
}