package LLD.CashWithrawProcessor;

import LLD.ATM;

public class FiveHundredCashWithdrawProcessor extends CashWithdrawProcessor{
    public FiveHundredCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }
    @Override
    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required<=atm.getNoOf500Notes()){
            atm.deductNoOf500Notes(required);
        }
        else if(required>atm.getNoOf500Notes()){
            atm.deductNoOf500Notes(required);
            balance += (required-atm.getNoOf500Notes())*500;
        }

        if(balance != 0)
            super.withdraw(atm,balance);

    }
}
