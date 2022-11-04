public class UI {
    private UIState state = new MenuState();
    private String x;

    public void setState(UIState uiState) {
        this.state = uiState;
    }

    public void setX(String x) {
        this.x = x;
    }
    
    public void prevState(){
        state.prev(this, this.x);
    }

    public void nextState(){
        state.next(this, this.x);
    }
}
