package com.robertramirez.creationalpatterns.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Person {

    private String name;
    private int age;
    private String municipality;
    private String school;
    private String workPlace;

    public static class Builder {
        private Person person;

        public Builder(String name){
            person = new Person();
            person.name = name;
        }

        public Builder setMunicipality(String municipality){
            person.municipality = municipality;
            return this;
        }

        public BuilderMajor setMajor(int age){
            if(age < 18) throw new IllegalArgumentException("is minor");
            person.age = age;
            return new Person.BuilderMajor(person);
        }

        public BuilderMinor setMinor(int age){
            if(age > 18) throw new IllegalArgumentException("is major");
            person.age = age;
            return new Person.BuilderMinor(person);
        }

    }

    public static class BuilderMajor {
        private Person person;

        private BuilderMajor(Person person){
            this.person = person;
        }

        public BuilderMajor setWorkPlace(String workPlace){
            person.workPlace = workPlace;
            return this;
        }

        public Person build(){
            return person;
        }
    }

    public static class BuilderMinor {
        private Person person;

        private BuilderMinor(Person person){
            this.person = person;
        }

        public BuilderMinor setSchool(String school){
            this.person.school = school;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
