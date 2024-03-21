public class Garage {

    private Accounting accounting;
    private String name;

    private CarMarket market;

    public Garage(String name){
        this.name = name;
        accounting = new Accounting( 100000 );
        System.out.println( name+ " hat eröffnet. In der Kasse sind " +accounting.getBalance()+ " €");

        //Carmarket Objekt erzeugen und in Feld speichern
        market = new CarMarket();

        Car car = buyCar("Volvo");
        if(car != null) {
            System.out.println("Auto wurde gekauft: " + car.getBrand()
                    + " für " + car.getPrice() + " und hat " + car.getSeats() + " Sitze");
        }
        else
        {
            System.out.println("Kein Auto gekauft.");
        }

        System.out.println("Kasse: "+ accounting.getBalance());
    }

    /**
     * Buy Car - prüft ob genug Geld vorhanden ist und kauft das mit brand gegebene Auto
     * und gibt es anschließend zurück
     */
    private Car buyCar(String brand){

        double price = market.getPriceOfCar(brand);

        if(price > 0 && accounting.withdrawMoney(price)){

            //es ist Geld da bzw. wurde schon abgezogen, Auto kann geholt werden
         return market.getCar(brand);
        }

        return null;
    }






}
