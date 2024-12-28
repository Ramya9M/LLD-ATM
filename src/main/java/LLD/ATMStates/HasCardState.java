package LLD.ATMStates;

import LLD.ATM;
import LLD.Card;

public class HasCardState  extends  ATMState{

    HasCardState(){
        System.out.println("enter pin number : ");
    }
    @Override
    public void authenticatePin(ATM atm, Card card, String pin) {
        if(card.isCorrectPinEntered(pin)){
            System.out.println("correct pin enter pls proceed to select transaction type : ");
            atm.setAtmState(new SelectOperationState());
        }
        else{
            System.out.println("invalid pin number");
            exit(atm);
        }

    }

    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("exit happened..");
    }
    @Override
    public void returnCard() {
        System.out.println("please collect your card");
    }
}
