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

        Car car = market.getCar("Volvo");
        System.out.println("Auto geholt " + car.getBrand());

        Car car3 = market.getCar("Volvo");
        System.out.println("Auto geholt " + car3.getBrand());




        Car car2 = market.getCar("Honda");
        System.out.println("Auto geholt " + car2.getBrand());
    }







}
