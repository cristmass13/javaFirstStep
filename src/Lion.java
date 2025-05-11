public class Lion extends CatFamily{
    public Lion() {
        super (2, true, 4);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("антилопу");
    }
}
