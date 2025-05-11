public class Cat  extends CatFamily {
    public Cat () {
        super(2,false, 4);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("вискас");
    }
}
