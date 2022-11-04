public class ProductImplement implements Product {
    private String item_name = "Personal Computer";
    public void getItem(String item) {
        this.item_name = item;
    }
    @Override
    public String decorate() {
        return "Your " + item_name + " will have following hardware: ";
    }
}
