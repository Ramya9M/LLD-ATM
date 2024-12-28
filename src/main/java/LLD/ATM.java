package LLD;

import LLD.ATMStates.ATMState;
import LLD.ATMStates.IdleState;

public class ATM {
    private static ATM atmObject = new ATM();
    private ATMState atmState;
    private int atmBalance;
    private int noOf500Notes;
    private int noOf2000Notes;
    private int noOf100Notes;

    public static ATM getInstance(){
        atmObject.setAtmState(new IdleState());
        return atmObject;
    }

    public ATMState getAtmState(){
        return this.atmState;
    }
    public void setAtmState(ATMState atmState){
        this.atmState = atmState;
    }
    public int getAtmBalance(){
        return atmBalance;
    }
    public void setAtmBalance(int atmBalance, int noOf500Notes, int noOf100Notes, int noOf2000Notes){
        this.noOf2000Notes = noOf2000Notes;
        this.noOf500Notes  = noOf500Notes;
        this.noOf100Notes  = noOf100Notes;
        this.atmBalance    = atmBalance;
    }
    public void deductAtmBalance(int amt){
        atmBalance = atmBalance - amt;
    }
    public int getNoOf500Notes(){
        return noOf500Notes;
    }
    public int getNoOf2000Notes(){
        return noOf2000Notes;
    }
    public int getNoOf100Notes(){
        return noOf100Notes;
    }
    public void deductNoOf500Notes(int number){
        noOf500Notes = noOf500Notes - number;
    }
    public void deductNoOf2000Notes(int number){
        noOf2000Notes = noOf2000Notes - number;
    }
    public void deductNoOf100Notes(int number){
        noOf100Notes = noOf100Notes - number;
    }
    public void printCurrentState(){
        System.out.println("ATMBalance : " + atmBalance);
        System.out.println("No of 500 Notes : " + noOf500Notes);
        System.out.println("No of 100 Notes : " + noOf100Notes);
        System.out.println("No of 2k Notes : " + noOf2000Notes);
    }
}
