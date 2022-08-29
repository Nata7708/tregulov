package Lesson5;

public class BankAccount {
    int balance;

    int popolnenieScheta(int summa){
        balance+=summa;
        return balance;
    }

    int spysanieSopScheta(int raznost){
        balance-=raznost;
        return  balance;
    }
}
