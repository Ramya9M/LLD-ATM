package LLD.ATMStates;

import LLD.ATM;
import LLD.Card;
import LLD.TransactionType;

public class SelectOperationState extends ATMState{

    SelectOperationState(){
        System.out.println("All transaction types : ");
        TransactionType.show_TransactionType();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType tx) {

        switch (tx){
            case WITHDRAWAL :
                atm.setAtmState(new CashWithdrawalState());
                break;
            case CHECKBALANCE:
                atm.setAtmState(new CheckBalanceState());
                break;
            default :
                System.out.println("invalid operation...");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atm) {
       returnCard();
       atm.setAtmState(new CashWithdrawalState());
       System.out.println("exit happened");
    }
    @Override
    public void returnCard() {
    }


}
