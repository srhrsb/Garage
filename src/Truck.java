public class Truck extends Car{
    private float load;

    public Truck( String brand, float load  ){
        super(brand);
        this.load = load;
    }

    public float getLoad(){
        return load;
    }
}
