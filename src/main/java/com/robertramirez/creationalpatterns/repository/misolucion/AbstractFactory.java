package com.robertramirez.creationalpatterns.repository.misolucion;

public interface AbstractFactory<T> {
    T createRepository(Class<T> args) throws IllegalAccessException, InstantiationException;
}