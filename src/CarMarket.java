import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMarket {

    //Aufgabe: Implementieren Sie das Feld cars als List und verwenden
    // Sie in den dazugehörigen Teilen statt Array eine Liste
    //Lesen in der Dokumentation wie man Liste deklariert und verwendet

    private List<Car> cars = new ArrayList<Car>() ;

    public CarMarket(){
        cars = initCars();
    }

    /**
     * Creates 3 types of cars
     * @return array of type Car
     */
    public List<Car> initCars(){

        //der Liste die erstellten Objekte zuweisen
        var car = new Car("Trabant", 26, 700);
        cars.add( car );
        car.setPrice(1500);

        car = new Car("Volvo", 99, 1700);
        cars.add( car);
        car.setPrice(7000);

        car = new Car("Ente", 35, 800);
        cars.add( car );
        car.setPrice(4500);

        return cars; //Objekt cars zurückgeben
    }

    /**
     * Get Car - gibt ein Object eines Autos mit gegebener Marke zurück
     * @param brand String Marke des Autos
     * @return gibt eine Object dieses Autotyps zurück oder null
     */
    public Car getCar(String brand){
        for (Car car : cars){
            if( car.getBrand() == brand) {
               return car;
            }
        }
        return null;
    }

    /**
     * Buy car - Gibt das Auto mit gegebenem Wert brand zurück und entfernt das Objekt
     * zugleich aus der Liste der Autos
     * @param brand - Markenname des Autos
     * @return Car
     */
    public Car buyCar(String brand){
        var car = getCar(brand);
        if(car != null){
            cars.remove(car);
        }
        return car;
    }

    /**
     *Gibt die Anzahl der Autos im Markt zurück
     */
     public int getCarCount(){
         return cars.size();
     }


    public double getPriceOfCar(String brand){
        for (Car car : cars){
            if( car.getBrand() == brand) {
                return car.getPrice();
            }
        }
        return 0d;
    }

    private void addCarFromInput(){

         Scanner scanner = new Scanner(System.in);
         System.out.println("Neues Auto (Marke, Leistung, Gewicht): ");
         String input = scanner.nextLine();

         var command = input.split(",");
         if(command.length == 3){
             cars.add( new Car(command[0],
                           Integer.parseInt(command[1]),
                           Integer.parseInt(command[2])
                     )
             );
         }

    }
















    //Alternativ:




//    public Car[] initCars(){
//        // ein Array, das 3 Objekte vom Typen Car speichern soll, deklarieren



//        Car[] cars = {
//         new Car("Trabant", 26, 700),
//         new Car("Volvo", 99, 1700),
//         new Car("Ente", 35, 800)
//        };
//
//        cars[1].setPrice(7000);
//        cars[2].setPrice(4500);
//        cars[0].setPrice(1500);
//
//        return cars; //Objekt cars zurückgeben
//    }

}
