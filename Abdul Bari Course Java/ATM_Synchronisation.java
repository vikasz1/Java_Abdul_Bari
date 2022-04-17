
class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking balance");
        
        try{Thread.sleep(1000);}catch (InterruptedException e){};
    }

    synchronized public void withdrawBalance(String name, int amount) {
        System.out.println(name + " is withdrawing " + amount + " amount");
        try{Thread.sleep(1000);}catch (InterruptedException e){};

    }
}

class Customer extends Thread { 
    ATM atm;
    private String name;
    private int amount;

    public Customer(String name, int amount,ATM a) {
        this.name = name;
        this.amount = amount;
        this.atm = a;
    }
    public void useATM() {
        atm.checkBalance(name);
        atm.withdrawBalance(name, amount);
    }
    // @Override
    public void run() {
        useATM();
    }
}


public class ATM_Synchronisation {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer customer1 = new Customer("Vikas",2000,atm);
        Customer customer2 = new Customer("Shivanand",5000,atm);
        customer1.start();
        customer2.start();
    }
}