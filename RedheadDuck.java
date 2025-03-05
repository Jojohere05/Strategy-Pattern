public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super(new FlyWithWings(), new Quack(), new Swim());
    }

    @Override
    public void display() {
        System.out.println("I am a Redhead Duck!");
    }
}