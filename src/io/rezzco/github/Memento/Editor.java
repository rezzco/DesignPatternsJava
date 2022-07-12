package io.rezzco.github.Memento;


public class Editor  implements StatefullEditor,  Editorial {
    private String content;

    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;

    }

    @Override
    public EditorState createState(){
        return new EditorState(content);
    }
    @Override
    public void restoreState(State state){
        content=state.getContent();
    }
}
