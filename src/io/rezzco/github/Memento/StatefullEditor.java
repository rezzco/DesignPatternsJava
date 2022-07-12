package io.rezzco.github.Memento;

public interface StatefullEditor<T extends State> {

    T createState();
     void restoreState(T t);


}
