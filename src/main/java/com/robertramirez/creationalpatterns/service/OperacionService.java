package com.robertramirez.creationalpatterns.service;

import com.robertramirez.creationalpatterns.repository.RepositorioAlumnos;
import com.robertramirez.creationalpatterns.repository.RepositorioAlumnosRelacional;
import com.robertramirez.creationalpatterns.repository.RepositorioCursos;
import com.robertramirez.creationalpatterns.repository.RepositorioCursosRelacional;

public class OperacionService {

    public void operacion(){
        RepositorioAlumnos repoAlumnos = new RepositorioAlumnosRelacional();
        RepositorioCursos repoCursos = new RepositorioCursosRelacional();
        //.... por cada tipo de repositorio se creara una interfaz y su implementacion
        // ... si fuera NOSQL entonces se duplicarian las clases
    }
}
