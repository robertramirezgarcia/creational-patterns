package com.robertramirez.creationalpatterns.service;

import com.robertramirez.creationalpatterns.entity.Person;

public class MainService {

    public static void main(String[] args){
        Person mother = new Person.Builder("Mary")
                .setMunicipality("Jungla")
                .setMajor(38)
                .setWorkPlace("Google")
                .build();

        Person son = new Person.Builder("John")
                .setMinor(5)
                .setSchool("ABC")
                .build();

        System.out.println("mother: " + mother.toString());
        System.out.println("son: " + son.toString());
    }

}
