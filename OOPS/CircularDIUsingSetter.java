// create both objects first, then link them afterwards
class Car{

    Engine engine;

    void setEngine(Engine e){

        engine = e;
    }

    void drive(){
        System.out.println("Car is running...");
        engine.start();
    }
}
class Engine{

    Car car;

    void setCar(Car c){
        car = c;
    }

    void start(){
        System.out.println("Engine is running...");
    }
}
public class CircularDIUsingSetter {
    
    public static void main(String[] args) {
        
        Engine engine = new Engine();
        Car car = new Car();

        car.setEngine(engine);
        engine.setCar(car);

        car.drive(); // car calls engine.start() --> engine is aware of car
    }
}