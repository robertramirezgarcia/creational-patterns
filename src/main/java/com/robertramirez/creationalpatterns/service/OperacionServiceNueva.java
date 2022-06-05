package com.robertramirez.creationalpatterns.service;

import com.robertramirez.creationalpatterns.repository.*;
import com.robertramirez.creationalpatterns.repository.misolucion.Factory;

public class OperacionServiceNueva {

    /*public static void factoryCurso(){
        RepositorioAlumnos repoAlumnos = (new com.robertramirez.creationalpatterns.repository.FactoryRelacional()).createRepositoryAlumnos();
        RepositorioCursos repoCursos = (new com.robertramirez.creationalpatterns.repository.FactoryRelacional()).createRepositoryCursos();

        repoAlumnos.listaAlumnos().stream().forEach(System.out::println);
        repoCursos.listaCursos().stream().forEach(System.out::println);
    }*/

    public static void factoryPersonal() {
        try {
            RepositorioAlumnos repoAlumnos = (new Factory<RepositorioAlumnosRelacional>()).createRepository(RepositorioAlumnosRelacional.class);
            RepositorioCursos repoCursos = (new Factory<RepositorioCursosRelacional>()).createRepository(RepositorioCursosRelacional.class);
            repoAlumnos.listaAlumnos().stream().forEach(System.out::println);
            repoCursos.listaCursos().stream().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        public static void main(String[] args){
            factoryPersonal();
        }

    }

