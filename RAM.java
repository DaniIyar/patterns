public class RAM extends Hardware {
    public RAM(Product item) {
        super(item);
    }

    public String decorate() {
        return super.decorate() + addRAM();
    }

    private String addRAM() {
        return " 4GB RAM ";
    }
}
