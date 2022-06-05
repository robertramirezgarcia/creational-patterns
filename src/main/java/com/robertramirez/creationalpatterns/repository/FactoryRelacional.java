package com.robertramirez.creationalpatterns.repository;

public class FactoryRelacional implements AbstractFactory{
    @Override
    public RepositorioAlumnos createRepositoryAlumnos() {
        return new RepositorioAlumnosRelacional();
    }

    @Override
    public RepositorioCursos createRepositoryCursos() {
        return new RepositorioCursosRelacional();
    }
}
