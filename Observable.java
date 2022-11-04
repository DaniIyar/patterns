import java.util.List;

public interface Observable {
    void subscribe(Customer customer);
    void unsubscribe(Customer customer);
    void sendAll();
    boolean checkItem(String checkingItem);
}
