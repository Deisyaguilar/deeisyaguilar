package com.techelevator;

public class CreditCardAccount implements Accountable {

    private String accountHolderName;
    private String cardNumber;
    private int debt = 0;

    public CreditCardAccount(String accountHolderName, String cardNumber) {
        this.accountHolderName = accountHolderName;
        this.cardNumber = cardNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getDebt() {
        return debt;
    }

    public int getBalance(){
        return -debt;
    }

    public int pay(int amountToPay){
        if(amountToPay > 0){
            debt -= amountToPay;
        }
        return debt;
    }

    public int charge(int amountToCharge){
        if(amountToCharge > 0){
            debt += amountToCharge;
        }
        return debt;
    }
}
