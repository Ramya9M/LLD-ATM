package LLD.ATMStates;

import LLD.ATM;
import LLD.Card;
import LLD.TransactionType;

public abstract class ATMState {

    public void insertCard(ATM atm, Card card){
        System.out.println("Something went wrong !!!");
    }

    public void authenticatePin(ATM atm, Card card, String pin){
        System.out.println("Something went wrong !!!");
    }

    public void selectOperation(ATM atm, Card card, TransactionType tx){
        System.out.println("Something went wrong !!!");
    }

    public void cashWithdrawal(ATM atm, Card card, int withdrawAmt){
        System.out.println("Something went wrong !!!");
    }

    public void checkBalance(ATM atm, Card card){
        System.out.println("Something went wrong !!!");
    }

    public void returnCard(){
        System.out.println("Something went wrong !!!");
    }
    public void exit(ATM atm){
        System.out.println("Something went wrong !!!");
    }
}
