public class Main {
    public static void main(String[] args) {
        Father ob1 = new Father("Андрей", 200, 40);
        Mother ob2 = new Mother("Ольга", 180, 35);
        Son ob3 = new Son("Серёжа", 180, 17);

        System.out.println("Info Father");
        ob1.showStile();
        ob1.showInfo();

        System.out.println();

        System.out.println("Info Mother");
        ob2.showStile();
        ob2.showInfo();

        System.out.println();

        System.out.println("Info Son");
        ob3.showStile();
        ob3.showInfo();
    }
}