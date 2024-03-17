public class Garage {

    private Accounting accounting;
    private String name;

    private CarMarket market;

    public Garage(String name){
        this.name = name;
        accounting = new Accounting( 100000 );
        System.out.println(name+ " hat eröffnet. In der Kasse sind " +accounting.getBalance()+ " €");

        //Carmarket Objekt erzeugen und in Feld speichern
        market = new CarMarket();
    }






}
