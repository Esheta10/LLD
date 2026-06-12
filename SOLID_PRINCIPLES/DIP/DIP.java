package SOLID_PRINCIPLES.DIP;

/* Dependency Inversion Principle - 
    1. High level modules should not depend on low-level modules. Both should depend on abstractions(eg: Interfaces)
    2. Abstraction should not depend on details.  Details(concrete implementations) should depend on Abstraction.
 */ 

// create an interface(contract)
// abstraction(both sides depend on this)
interface EmailClient{
    void sendEmail(String to, String message);
}

// implement the interface for each provider

// Gmail implementation
class GmailClient implements EmailClient{
    
    public void sendEmail(String to, String message){
        System.out.println("Sending via Gmail to: " + to);
    }
}

// Outlook implementation
class OutlookClient implements EmailClient{

    public void sendEmail(String to, String message){
        System.out.println("Sending via Outlook to: " + to);
    }
}

// Amazon SES implementation
class SESClient implements EmailClient{

    public void sendEmail(String to, String message){
        System.out.println("Sending via Amazon SES to:" + to);
    }
}

// High level module depends on Interface only
// It only knows about EmailClient interface
class EmailService{

    private EmailClient emailClient;

    public EmailService(EmailClient emailClient){
        this.emailClient = emailClient;
    }

    public void sendWelcomeEmail(String to){
        emailClient.sendEmail(to, "Welcome!");
    }

    public void sendPasswordReset(String to){
        emailClient.sendEmail(to, "Reset your password here... ");
    }
}
public class DIP {  
    public static void main(String[] args) {
        
        // use Gmail
        EmailService service1 = new EmailService(new GmailClient());
        service1.sendWelcomeEmail("ram@gmail.com");
        service1.sendPasswordReset("ram@gmail.com");

        // Switch to Outlook
        EmailService service2 = new EmailService(new OutlookClient());
        service2.sendWelcomeEmail("ram@gmail.com");
        service2.sendPasswordReset("ram@gmail.com");

        // Switch to Amazon SES
        EmailService service3 = new EmailService(new SESClient());
        service3.sendWelcomeEmail("ram@gmail.com");
        service3.sendPasswordReset("ram@gmail.com");
    }
}
