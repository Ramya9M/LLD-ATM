package LLD;

public class ATMRoom {

    User user;
    ATM atm;
    public static void main(String args[]) {

        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentState();
        atmRoom.atm.getAtmState().insertCard(atmRoom.atm, atmRoom.user.card);
        atmRoom.atm.getAtmState().authenticatePin(atmRoom.atm, atmRoom.user.card, "112211");
        atmRoom.atm.getAtmState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.WITHDRAWAL);
        atmRoom.atm.getAtmState().cashWithdrawal(atmRoom.atm, atmRoom.user.card, 2700);
        atmRoom.atm.printCurrentState();


    }

    private void initialize() {

        //create ATM
        atm = ATM.getInstance();
        atm.setAtmBalance(3500, 1,2,5);

        //create User
        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setUserAccount(createBankAccount());
        return card;
    }

    private UserAccount createBankAccount() {

        UserAccount bankAccount = new UserAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }
}
