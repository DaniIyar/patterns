public class Memory extends Hardware {
    public Memory(Product item) {
        super(item);
    }

    public String decorate() {
        return super.decorate() + addMemory();
    }

    private String addMemory() {
        return " 1TB memory ";
    }
}
