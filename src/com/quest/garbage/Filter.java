package com.quest.garbage;

@FunctionalInterface
public interface Filter {
    boolean filter(Book book,double price);
}
