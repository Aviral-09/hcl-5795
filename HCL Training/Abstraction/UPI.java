package Abstraction;

class UPI extends Payment {
    void pay(double amount){
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}
