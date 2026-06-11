package SOLID_PRINCIPLES.OCP;

// OCP - Open and Closed Principle -> Open for extension, closed for modification
interface PaymentMethod{
    void processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod{
        public void processPayment(double amount){
            System.out.println("Processing credit card payment of Rs. " + amount);
        }
}

class PayPalPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing PayPal payment of Rs. " + amount);
    }
}

class UPIPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing UPI Payment of Rs." + amount);
    }
}

// can be extended to other payment methods
class BitCoinPayment implements PaymentMethod{
    public void processPayment(double amount){
        System.out.println("Processing BitCoin payment of Rs. " + amount);
    }
}

// Payment Processor -> high level class
// Closed for modification -> no matter how many payment methods we add -> this class will never change
class PaymentProcessor{

    private PaymentMethod paymentMethod;
    
    // depends on the Interface, not concrete class
    PaymentProcessor(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount){
        paymentMethod.processPayment(amount);
    }
}

class Main{
    public static void main(String[] args) {
        
        PaymentProcessor  p1 = new PaymentProcessor(new CreditCardPayment());
        p1.process(1000);

        PaymentProcessor p2 = new PaymentProcessor(new PayPalPayment());
        p2.process(500);

        PaymentProcessor p3 = new PaymentProcessor(new UPIPayment());
        p3.process(100);

        PaymentProcessor p4 = new PaymentProcessor(new BitCoinPayment());
        p4.process(50);
    }
}