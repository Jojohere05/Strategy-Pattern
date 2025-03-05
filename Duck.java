public abstract class Duck {
    FlyBehaviour flyBehavior;
    QuackBehaviour quackBehavior;
    SwimBehaviour swimBehavior;
    public Duck(FlyBehaviour flyBehavior, QuackBehaviour quackBehavior, SwimBehaviour swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }


}
