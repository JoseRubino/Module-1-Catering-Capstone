package com.techelevator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Transaction {
    public double balance;

    public double getBalance() {
        return balance;
    }

    public void addMoney (double moneyToAdd) {
        Set<Double> values = new HashSet<Double>(Arrays.asList(new Double[]{1.00, 5.00, 10.00, 20.00}));
        if (values.contains(moneyToAdd)) {
            balance += moneyToAdd;
            System.out.print("Your current balance is: $");
            System.out.printf("%.2f", balance);
            System.out.println(".");
        } else {
            System.out.println("Invalid Currency Amount, only 1's, 5's, 10's, and 20's");
        }
    }

        public void getChange (double balanceAfterPurchase) {
            Double[] change = new Double[]{20.00, 10.00, 5.00, 1.00, 0.25, 0.10, 0.05};
            String[] typeOfCoin = new String[]{"-20(s)", "-10(s)", "-5(s)", "-1(s)", "-quarter(s)", "-dime(s)", "-nickel(s)"};
            for (int i = 0; i < change.length; i++) {
                int count;
                count = (int) (balanceAfterPurchase / change[i]);
                balanceAfterPurchase -= (change[i] * count);
                System.out.println(count + " " + typeOfCoin[i]);
            }

        }
    }
