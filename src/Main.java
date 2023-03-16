public class Main {
    public static void main(String[] args) {

        // Strategy design pattern (behavioural)
        Duck mallard = new MallarDuck();
        mallard.performFly();
        mallard.display();
        mallard.performQuack();
        System.out.println("");
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.swim();
        mallard.swim();



        // Interface
        /*var acc1 = new BankAccount(1000);
        var accounts = new BankAccount[3];
        accounts[0] = acc1;
        accounts[1] = new BankAccount(2000);
       // accounts[2] = new BankAccount(3000);

        System.out.println("Accounts average: "+ average(accounts));

        var countries = new Measurable[]{
                new Country("A", 15000),
                new Country("B", 30000),
                new Country("C", 15000)};
        System.out.println("Countries + bank: " + average(countries));
        var countries2 = new Country[]{
                new Country("A", 15000),
                new Country("B", 30000),
                new Country("C", 15000)};
        System.out.println("Countries: " + average(countries));
*/
    }
    public static double average(Measurable[] objects){
        double total = 0;
        int counter = 0;
        for (var obj : objects) {
            if (obj != null){
                total += obj.getMeasure();
                ++counter;
            }
            if (counter != 0){
                return total / counter;
            }
        }
        return 0;
    }
}