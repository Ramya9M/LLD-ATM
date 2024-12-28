package LLD.ATMStates;

import LLD.ATM;
import LLD.Card;
import LLD.CashWithrawProcessor.CashWithdrawProcessor;
import LLD.CashWithrawProcessor.FiveHundredCashWithdrawProcessor;
import LLD.CashWithrawProcessor.OneHundredCashWithdrawProcessor;
import LLD.CashWithrawProcessor.TwoThousandCashWithdrawProcessor;

public class CashWithdrawalState extends ATMState{

    CashWithdrawalState(){
        System.out.println("enter the withdrawal amount: " );
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawAmt) {
         if(atm.getAtmBalance() < withdrawAmt)
             System.out.println("insufficient funds in ATM");
         else if(card.getBalance() < withdrawAmt)
             System.out.println("insufficient funds in card");
         else{
             atm.deductAtmBalance(withdrawAmt);
             card.deductBalance(withdrawAmt);

             CashWithdrawProcessor processor = new TwoThousandCashWithdrawProcessor(
                                               new FiveHundredCashWithdrawProcessor(
                                               new OneHundredCashWithdrawProcessor(null)));
             processor.withdraw(atm,withdrawAmt);
             exit(atm);
         }
    }
    @Override
    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("exit happeed");
    }
    @Override
    public void returnCard() {
        System.out.println("please collect ur card");
    }


}
