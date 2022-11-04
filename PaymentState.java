public class PaymentState implements UIState{
    public void next(UI ui, String x){
    }
    public void prev(UI ui, String x){
        ui.setState(new MenuState());
    }
}