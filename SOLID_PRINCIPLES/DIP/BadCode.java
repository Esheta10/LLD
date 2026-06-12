package SOLID_PRINCIPLES.DIP;

// Problem -> Tightly coupled class


// Low-level Module -> GmailClient
class GmailClient{
    public void sendEmail(String to, String message){
        System.out.println("Sending via Gmail to "+ to);
    }
}

// High-level module -> directly depends on Gmail Client
class EmailService{
    private GmailClient gmailClient; // tightly coupled!

    public EmailService(){
        gmailClient = new GmailClient(); // tightly coupled -> 
        // The problem is, if the manager says, switch from "Gmail to Outlook", you have to re-write the EmailService, as it's tightly coupled
    }

    public void sendWelcomeEmail(String to){
        gmailClient.sendEmail(to, "Welcome!");
    }
}
public class BadCode {
    public static void main(String[] args) {
        EmailService emailservice = new EmailService();
        emailservice.sendWelcomeEmail("Esheta");
    }
}
