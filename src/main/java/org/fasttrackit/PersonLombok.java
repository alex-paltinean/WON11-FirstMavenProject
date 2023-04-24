package org.fasttrackit;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@MyFirstAnnotation
public class PersonLombok {
    @MyFirstAnnotation(flag = true)
    private final String name;
    private final int age;
    private final String country;
    private final boolean isMarried;
    private final String company;

    @PopulateChild(children = 4)
    private int children = 0;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @MyFirstAnnotation(flag = true)
    private boolean youWillNeverSeeMe = false;

    @MyFirstAnnotation
    public void doSomething() {

    }
}
