package com.corejava.Java8features;

import java.util.Arrays;
import java.util.List;

public class StreamAPI3 {

	public static void main(String[] args) {

        List<Person> persons = Arrays.asList(
                new Person("pratap", 30),
                new Person("lokesh", 20),
                new Person("amar", 40)
        );

        Person result = getStudentByName(persons, "pratap");
        System.out.println(result);

    }

    private static Person getStudentByName(List<Person> persons, String name) {

        Person result = null;
        for (Person temp : persons) {
            if (name.equals(temp.getName())) {
                result = temp;
            }
        }
        return result;
    }
}
