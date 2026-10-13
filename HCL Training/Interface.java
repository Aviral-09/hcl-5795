interface Payment {
    void pay(int amount);
}

interface Receipt {
    void generateReceipt();
}

class UPI implements Payment, Receipt {

    public void pay(int amount) {
        System.out.println("Payment through UPI: Rs." + amount);
    }

    public void generateReceipt() {
        System.out.println("UPI receipt generated");
    }
}

public class Interface{
    public static void main(String[] args) {
        UPI upi = new UPI();

        upi.pay(500);
        upi.generateReceipt();
    }
}