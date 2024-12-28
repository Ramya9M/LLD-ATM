package LLD;

public enum TransactionType {
    WITHDRAWAL,
    CHECKBALANCE;

    public static void show_TransactionType(){

        for(TransactionType tx : TransactionType.values()){
            System.out.println(tx.name());
        }
    }
}
