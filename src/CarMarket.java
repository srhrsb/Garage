public class CarMarket {
    private Car[] cars;

    public CarMarket(){
        cars = initCars();
    }

    /**
     * Creates 3 types of cars
     * @return array of type Car
     */
    public Car[] initCars(){
        // ein Array, das 3 Objekte vom Typen Car speichern soll, deklarieren
        Car[] cars = new Car[3];

        //dem Array die erstellten Objekte zuweisen
        cars[0]= new Car("Trabant", 26, 700);
        cars[0].setPrice(1500);

        cars[1]= new Car("Volvo", 99, 1700);
        cars[1].setPrice(7000);

        cars[2]= new Car("Ente", 35, 800);
        cars[2].setPrice(4500);

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
