public class Son extends Family implements Interface {
    private String style;
    Son(String name, double h, double y) {
        super(h, y);
        setStyle(name);
    }

    @Override
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public void showStile() {
        System.out.println("Son: " + style);
    }
}
