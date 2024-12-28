package LLD.CashWithrawProcessor;

import LLD.ATM;

public class TwoThousandCashWithdrawProcessor extends CashWithdrawProcessor{
    public TwoThousandCashWithdrawProcessor(CashWithdrawProcessor cashWithdrawProcessor) {
        super(cashWithdrawProcessor);
    }
    @Override
    public void withdraw(ATM atm, int remainingAmount) {

        int required = remainingAmount/500;
        int balance = remainingAmount%500;

        if(required<=atm.getNoOf2000Notes()){
            atm.deductNoOf2000Notes(required);
        }
        else if(required>atm.getNoOf2000Notes()){
            atm.deductNoOf2000Notes(required);
            balance += (required-atm.getNoOf2000Notes())*500;
        }

        if(balance != 0)
            super.withdraw(atm,balance);
    }
}
