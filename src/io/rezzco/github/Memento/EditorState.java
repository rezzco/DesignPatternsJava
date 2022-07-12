package io.rezzco.github.Memento;

public class EditorState implements State{
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
