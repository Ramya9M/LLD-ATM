package LLD;

import java.sql.Date;

public class Card {
    private String cardHolderName;
    private int ccv;
    private String cardNo;
    private Date expiryDate;
    private UserAccount userAccount;

    private static String PIN = "112211";

    public boolean isCorrectPinEntered(String pin){

        if(PIN==pin){
            return true;
        }
        return false;
    }
    public void setUserAccount(UserAccount userAccount){
        this.userAccount = userAccount;
    }
    public int getBalance(){
        return userAccount.balance;
    }
    public void deductBalance(int amt){
        userAccount.withdraw(amt);
    }
}
