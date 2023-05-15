package org.fasttrackit.functional;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExercises {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Mike", 28, "student", false),
                new Citizen("Amanda", 35, "artist", true),
                new Citizen("Nick", 24, "designer", true),
                new Citizen("Pete", 45, "artist", false)
        );

        List<Citizen> result = citizens.stream().filter(citizen -> citizen.age() > 40).toList();
        System.out.println(result);

        List<String> strings = citizens.stream().map(Citizen::name).toList();
        System.out.println(strings);

        System.out.println(citizens.stream().skip(1).limit(2).toList());

        System.out.println(citizens.stream().map(Citizen::profession).distinct().toList());

        System.out.println(citizens.stream().filter(Citizen::married).collect(Collectors.toSet()));

        System.out.println(citizens.stream().filter(citizen -> citizen.name().length() == 4).count());

        System.out.println(citizens.stream().allMatch(Citizen::married));
        System.out.println(citizens.stream().anyMatch(Citizen::married));

        System.out.println(citizens.stream().map(Citizen::name).sorted(Comparator.reverseOrder()).toList());

        System.out.println(citizens.stream().sorted(Comparator.comparing(Citizen::name)).toList());

        System.out.println(citizens.stream().sorted(Comparator.comparing(Citizen::profession).thenComparing(Citizen::age)).toList());

        System.out.println(citizens.stream().mapToInt(Citizen::age).max());

        System.out.println(citizens.stream().filter(Citizen::married).findFirst().orElseGet(() -> new Citizen("Lorand", 34, "politician", true)));

    }
}

record Citizen(String name, int age, String profession, boolean married) {

}
