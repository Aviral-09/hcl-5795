package Abstraction;

class Card extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}
