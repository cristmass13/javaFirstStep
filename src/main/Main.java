package main;

import box.Box;
import box.BoxWeight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box box = new Box(5,2,2);
        box.combineBox(box);
        double volume = box.showVolume();
        System.out.println(volume);
        Box box1 = new Box(3, 3, 3);
        Box box2 = new Box(box, box1);
        double volume1 = box2.showVolume();
        System.out.println(volume1);

        System.out.println(box2.getHeight());
        System.out.println(box2.getLength());
        System.out.println(box2.getWidth());

        System.out.println(box1.getHeight());
        System.out.println(box1.getLength());
        System.out.println(box1.getWidth());

        System.out.println(box.getHeight());
        System.out.println(box.getLength());
        System.out.println(box.getWidth());

        BoxWeight boxWeight = new BoxWeight(12, 13, 14, 90);
        boxWeight.showInfo();
    }
}