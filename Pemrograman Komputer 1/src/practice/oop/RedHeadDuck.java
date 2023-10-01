package practice.oop;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    public void display(){
        System.out.println("I'm real Red Headed Duck");
    }
}
