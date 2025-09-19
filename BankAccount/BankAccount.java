package BankAccount;

public class BankAccount {
    String holderName;
    String accountNumber;
    String branchCode;
    double balance;

    BankAccount(String holderName , String accountNumber , String branchCode , double balance
    ){
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.branchCode = branchCode;
        this.balance = balance;
    }
    BankAccount (BankAccount holder , String accountNumber , String branchCode){
        this.holderName = holder.holderName;
        this.accountNumber = accountNumber;
        this.balance = holder.balance;
        this.branchCode = branchCode;
    }

    public String accountDetails(){
        return  "Holder Name: "+holderName+
                "\nAccount Number: "+accountNumber+
                "\nBranch Code: "+branchCode+
                "\nBalance: Rs."+balance;
    }
    public static void main(String []args){
        BankAccount user1 = new BankAccount("Tabrez","ACC123","BR001",78978);
        BankAccount user2 = new BankAccount(user1 , "ACC456","BR002");
        System.out.println(user1.accountDetails());
        System.out.println();
        System.out.println(user2.accountDetails());;
    }
}
