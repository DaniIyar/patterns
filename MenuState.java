public class MenuState implements UIState{
    public void next(UI ui, String x){
        if(x.equals("1")){
            ui.setState(new ItemState());
        }
        else if(x.equals("2")){
            ui.setState(new PaymentState());
        }
    }
    public void prev(UI ui, String x){
//        loggedIn = false;
//        System.out.println("exiting...");
//        System.out.println("");
    }
}
