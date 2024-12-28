package LLD.CashWithrawProcessor;

import LLD.ATM;

public class OneHundredCashWithdrawProcessor extends CashWithdrawProcessor {
    public OneHundredCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }

    @Override
    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount/100;
        int balance = remainingAmount%100;

        if(required<=atm.getNoOf100Notes()){
            atm.deductNoOf100Notes(required);
        }
        else if(required>atm.getNoOf100Notes()){
            atm.deductNoOf100Notes(required);
            balance += (required-atm.getNoOf100Notes())*100;
        }

        if(balance != 0)
            super.withdraw(atm,balance);
    }
}
