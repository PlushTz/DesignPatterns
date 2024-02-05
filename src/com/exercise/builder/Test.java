package com.exercise.builder;

public class Test {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .setName("Builder")
                .setAge(100)
                .create();
        String name = person.getName();
        Integer age = person.getAge();
        System.out.println(name);
        System.out.println(age);
        System.out.println(person);
    }
}
