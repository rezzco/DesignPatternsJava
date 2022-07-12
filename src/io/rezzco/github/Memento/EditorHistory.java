package io.rezzco.github.Memento;

import java.util.Stack;

public class EditorHistory implements History<EditorState>{
    private Stack<EditorState> book;

    public EditorHistory(Stack<EditorState> book) {
        this.book = book;
    }

    public EditorHistory() {
        book = new Stack<EditorState>();
    }

    @Override
    public void push(EditorState entry) {
        book.push(entry);
    }

    @Override
    public EditorState pop() {
        return book.pop();
    }
}
