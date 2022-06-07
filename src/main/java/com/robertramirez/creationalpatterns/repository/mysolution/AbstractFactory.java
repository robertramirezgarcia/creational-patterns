package com.robertramirez.creationalpatterns.repository.mysolution;

public interface AbstractFactory<T> {
    T createRepository(Class<T> args) throws IllegalAccessException, InstantiationException;
}