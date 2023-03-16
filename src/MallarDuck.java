public class MallarDuck extends Duck{
    public MallarDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    public void display() {
        System.out.println("I am Mallar Duck");
    }

}
