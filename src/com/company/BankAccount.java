package com.company;

public class BankAccount {
    private double amount ;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        System.out.println("Ваш баланс - "  + amount );
        return amount;
    }

    public double withDraw(double sum) throws LimitException {
        if (sum > amount) {
            sum = amount;
            amount = amount - sum;
            System.out.println("баланс " + amount);
            throw new LimitException("На вашем балансе недостаточно средств. Ваш баланс - ", amount);
        } else {
            amount = amount - sum;
            System.out.println("Ваш баланс - " + amount);
        }


        return amount;
    }
}
