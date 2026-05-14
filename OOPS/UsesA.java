// Uses-A relationship --> Uses a relationship is one in which a method of one class 
// is using an object of another class

// Transaction uses Account to deposit the amount
class Account{

    String accno;
    String acc_name;
    int balance;

    Account(String accno1, String acc_name1, int balance1){

        accno = accno1;
        acc_name = acc_name1;
        balance = balance1;
    }
}

class Transaction{

    void deposit(Account account, int amount){

        account.balance = account.balance + amount;

        System.out.println("Amount deposited successfully");
        System.out.println("Account name: " + account.acc_name);
        System.out.println("Account number: " + account.accno);

        System.out.println("Total account balance: " + account.balance);
    }
}

public class UsesA {
     public static void main(String[] args) {
        
        Account ob1 = new Account("101", "Deepak", 10000);
        Transaction ob2 = new Transaction();
        ob2.deposit(ob1, 5000);
    }
}
