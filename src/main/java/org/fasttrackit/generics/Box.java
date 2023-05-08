package org.fasttrackit.generics;

public class Box<I> {
    private final I item;

    public Box(I item) {
        this.item = item;
    }

    public I getItem() {
        return item;
    }

    public void printContent(){
        System.out.println(item.toString());
    }
}
