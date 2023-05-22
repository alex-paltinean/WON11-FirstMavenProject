package org.fasttrackit.temp;

public class Car {
    private final Engine engine;

    Car() {
        engine = new Engine();
    }

    Car(Engine engine){
        this.engine = engine;
    }
}
