public class CatFamily {
    private int ears;
    private int legs;
    private boolean bigClaws;

    public void showInfo() {
        System.out.println("Количество ушей: " + ears + " Количество лап: " + legs + " Наличие больших когтей: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public CatFamily(int ears, boolean bigClaws, int legs) {
        this.ears = ears;
        this.bigClaws = bigClaws;
        this.legs = legs;
    }

    public void eat() {
        System.out.println("Кушаю");
    }
}
