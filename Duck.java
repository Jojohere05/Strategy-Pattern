public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehaviour quackBehavior;
    SwimBehaviour swimBehavior;
    public Duck(FlyBehaviour flyBehavior, QuackBehaviour quackBehavior, SwimBehaviour swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }


}
