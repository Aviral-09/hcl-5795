package Abstraction;

public class Main {
    public static void main(String[] args) {

        Payment p1 = new UPI();
        p1.pay(500);
        p1.paymentSucess();

        Payment p2 = new Card();
        p2.pay(1000);
        p2.paymentSucess();
    }
}

