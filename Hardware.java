public abstract class Hardware implements Product {
    private Product item;

    public Hardware(Product item) {
        this.item = item;
    }

    @Override
    public String decorate() {
        return this.item.decorate();
    }
}
