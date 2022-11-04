import java.util.ArrayList;
import java.util.List;

public class Shop implements Observable{

    private List<Customer> subscribers = new ArrayList<>();
    private List<String> items = new ArrayList<>();

    public void addItem(String item) {
        this.items.add(item);
        sendAll();
    }

    public void removeItem(String item) {
        this.items.remove(item);
    }

    @Override
    public void subscribe(Customer customer) {
        this.subscribers.add(customer);
    }

    @Override
    public void unsubscribe(Customer customer) {
        this.subscribers.remove(customer);
    }

    @Override
    public void sendAll() {
        for (Customer customer: this.subscribers) {
            customer.handleEvent(this.items);
        }
    }

    public boolean checkItem(String checkingItem){
        for (String item: this.items) {
            if(checkingItem.equals(item)){
                return true;
            }
        }
        return false;
    }
}