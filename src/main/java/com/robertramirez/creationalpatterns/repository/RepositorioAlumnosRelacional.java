package com.robertramirez.creationalpatterns.repository;

import java.util.Arrays;
import java.util.List;

public class RepositorioAlumnosRelacional implements RepositorioAlumnos{

    public RepositorioAlumnosRelacional() {
    }

    @Override
    public List<String> listaAlumnos() {
        return Arrays.asList("Alumno relacional");
    }
}
