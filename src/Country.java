public class Country implements Measurable{
    private String name;
    private double area;
    public Country(String name, double area){
        this.name = name;
        this.area = area;
    }

    @Override
    public double getMeasure() {
        return 0;
    }
}
