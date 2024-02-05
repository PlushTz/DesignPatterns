package com.exercise.builder;

public class Person {
    private String name;
    private Integer age;

    public String getName() {
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
        }

        public Builder setName(String name) {
            person.name = name;
            return this;
        }

        public Builder setAge(Integer age) {
            person.age = age;
            return this;
        }

        public Person create() {
            return person;
        }
    }
}
