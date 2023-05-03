package org.fasttrackit.homework;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@RequiredArgsConstructor
@ToString
public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    private boolean favourite;


}
