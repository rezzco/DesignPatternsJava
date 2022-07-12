package io.rezzco.github.Memento;

public interface History<T extends State> {
    void push(T entry);
    T pop();
}
