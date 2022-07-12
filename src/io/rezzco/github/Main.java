package io.rezzco.github;

import io.rezzco.github.Memento.Editor;
import io.rezzco.github.Memento.EditorHistory;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new EditorHistory();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        history.push(editor.createState());
        editor.restoreState(history.pop());
        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

    }

}
