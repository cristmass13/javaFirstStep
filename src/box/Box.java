package box;

public class Box {
    double length;
    double height;
    double width;

    public Box(double length, double width, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box combineBox(Box other) {
        return new Box(
        this.width + other.width,
        this.length + other.length,
        this.height + other.height
        );
    }

    public  void showInfo() {
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Высота: " + height);
    }

    public double showVolume() {
        return length * width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public Box(Box box1, Box box2) {
        this.height = box1.height + box2.height + 1;
        this.width = box1.width + box2.width + 1;
        this.length = box1.length + box2.length + 1;
    }
}
