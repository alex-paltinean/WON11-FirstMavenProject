package org.fasttrackit;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

public class ReflectionExercise {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        PersonLombok person = new PersonLombok("John", 33, "Romania", false, "FasttrackIT");
        Field field = PersonLombok.class.getDeclaredField("youWillNeverSeeMe");
        field.setAccessible(true);
        field.set(person, true);
        System.out.println("test");

        Annotation[] annotations = field.getAnnotations();
        System.out.println("");


        Field children = PersonLombok.class.getDeclaredField("children");
        PopulateChild annotation = children.getAnnotation(PopulateChild.class);
        children.setAccessible(true);
        children.set(person, annotation.children());
        System.out.println("");
    }

}
