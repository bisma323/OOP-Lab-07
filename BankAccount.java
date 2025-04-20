public class BankAccount {
    double getInterestRate(){
        return 0.05;
    }

    void DisplaYRate(){
        System.out.println(" Bank Account interest =" + getInterestRate());
    }


}

class SavingAccount extends BankAccount{
    double getInterestRate(){
        return 0.1;
    }

    void DisplaYRate(){
        System.out.println(" Saving Account =" + getInterestRate());
    }
}

class main{
    public static void main (String [] args){
        BankAccount object = new BankAccount();
        object.DisplaYRate();

        SavingAccount object2 = new SavingAccount();
        object2.DisplaYRate();
    }

}
