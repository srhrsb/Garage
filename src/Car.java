public class Car {
    private String brand;
    private int seats;
    private int horsePower;
    private int weight;
    private int price;

    public Car( String brand ){
        this.brand = brand;
        this.seats = 5;
        this.horsePower = 100;
        this.weight = 1800;
        this.price = 15000;
    }

    public Car( String brand, int horsePower, int weight ){
        this.brand = brand;
        this.seats = 5;
        this.horsePower = horsePower;
        this.weight = weight;
        this.price = 15000;
    }

    public void setPrice( int price ){

        if(price<1000){
            this.price = 1000;
        }
        else{
            this.price = price;
        }
    }

    public void setSeats( int seats ){
        this.seats = Math.clamp(seats, 2, 8);
    }

    public int getSeats(){
        return this.seats;
    }

    public int getPrice(){
        return this.price;
    }

    public String getBrand(){ return this.brand; }


    /**
     * Tune - verbessert das Auto und gibt die Kosten des Tunings zurück
     * @return Int cost
     */
    public int tune(){
        horsePower += 10;
        int cost = 300;
        price += cost;
        return cost;
    }
}
