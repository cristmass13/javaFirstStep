package box;

public class BoxWeight extends Box {
    private double weight;

    public BoxWeight(double length, double width, double height, double weight) {
        super(length, width, height);
        this.weight = weight;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + weight);
    }
}
