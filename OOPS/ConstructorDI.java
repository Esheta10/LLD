// Dependency Injection is a design pattern where object receives its dependencies from outside 
// rather than creating them itself.

class Engine{

    String type;

    Engine(String type1){

        type = type1;
    }
}
class Car{

    String carName;
    Engine engine;

    Car(String carName1, Engine engine1){

        carName = carName1;
        engine = engine1;
    }
    void showDetails(){

        System.out.println("Car name: " + carName);
        System.out.println("Engine type: "+ engine.type);
        System.out.println("------------------------------");
    }

}
public class ConstructorDI {
    
    public static void main(String[] args) {
        
        Engine e1 = new Engine("Petrol");
        Car c1 = new Car("Honda City", e1);
        c1.showDetails();

        Engine e2 = new Engine("Diesel");
        Car c2 = new Car("Toyota Fortuner", e2);
        c2.showDetails();
    }
}
