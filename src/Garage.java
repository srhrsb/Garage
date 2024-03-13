public class Garage {

    private Accounting accounting;
    private String name;

    public Garage(String name){
        this.name = name;
        accounting = new Accounting( 100000 );
        System.out.println(name+ " hat eröffnet. In der Kasse sind " +accounting.getBalance()+ " €");
    }
}
