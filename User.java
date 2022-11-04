import java.util.List;

public class User implements Customer{
    private static User instance;
    private User(){}
    public static User getInstance(){
        if(instance == null){
            instance = new User();
        }
        return instance;
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> items) {
        System.out.println();
        getInstance();
        System.out.println("These items are already on sale: ");
        for (String item: items) {
            System.out.println(item);
        }
        System.out.println("");
    }
}
