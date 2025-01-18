package com.exercise.builder;

public class Person {
    private String name;
    private Integer age;

    public String getName() {
        System.out.println("Name is " + name);
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class Builder {
        private Person person;

        public Builder() {
            person = new Person();
            System.out.println("Person created");
        }

        public Builder setName(String name) {
            person.name = name;
            System.out.println("Name set " + name);
            return this;
        }

        public Builder setAge(Integer age) {
            person.age = age;
            return this;
        }

        public Person create() {
            System.out.println("Person created");
            return person;
        }
    }
}
