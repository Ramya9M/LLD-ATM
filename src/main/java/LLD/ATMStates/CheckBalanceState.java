package LLD.ATMStates;

import LLD.ATM;
import LLD.Card;

public class CheckBalanceState extends ATMState{

    @Override
    public void checkBalance(ATM atm, Card card) {
        System.out.println("your balance : " + card.getBalance());
        exit(atm);
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("exit happened");
    }
}
