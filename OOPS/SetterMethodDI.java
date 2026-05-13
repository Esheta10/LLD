class Battery{

    String capacity;
    Battery(String capacity1){
        capacity = capacity1;
    }
}
class Phone{
    String phoneName;
    Battery battery;

    Phone(String phoneName1){
        phoneName = phoneName1;
    }
    void setBattery(Battery battery1){  // Battery is injected via setter
        battery = battery1;
    }
    void showDetails(){

        System.out.println("Phone name: " + phoneName);
        System.out.println("Battery: " + battery.capacity);
        System.out.println("-------------------------------");
    }
}
public class SetterMethodDI {
    
    public static void main(String[] args) {
        Battery b1 = new Battery("500mAh");
        Phone p1 = new Phone("MotoG-31");
        p1.setBattery(b1);
        p1.showDetails();
    }
}
