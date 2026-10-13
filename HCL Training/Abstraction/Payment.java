package Abstraction;

abstract class Payment {
    abstract void pay(double amount);

        void paymentSucess(){
            System.out.println("payment sucessfull");
        }
}
