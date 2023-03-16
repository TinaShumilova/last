public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Model duck");
    }
}
