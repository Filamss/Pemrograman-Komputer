package practice.oop;

public class DecoyDuck extends Duck{
    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }
    public void display(){
        System.out.println("I'm a Duck Decoy");
    }
}
