public class Father extends Family implements Interface {
    private String style;

    Father(String name, double h, double y) {
        super(h, y);
        setStyle(name);
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void showStile() {
        System.out.println("Father: " + style);
    }
}
