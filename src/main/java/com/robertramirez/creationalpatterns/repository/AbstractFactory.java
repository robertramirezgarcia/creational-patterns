package com.robertramirez.creationalpatterns.repository;

public interface AbstractFactory {
    RepositorioAlumnos createRepositoryAlumnos();
    RepositorioCursos createRepositoryCursos();
}
