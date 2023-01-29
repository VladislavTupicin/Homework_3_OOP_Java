public class Family implements Interface2{
    private double height;
    private double years;

    Family(double h, double y){
        this.height = h;
        this.years = y;
    }

    public void showInfo() {
        System.out.println("Height: " + height);
        System.out.println("Years: " + years);
    }
}
