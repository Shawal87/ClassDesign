public class BankAccount {

    private int acctnum;
    private int balance =0;
    private boolean isforeign = false;

    public BankAccount(int a){
        acctnum = a;
    }

    public int getAcctnum(){
        return acctnum;
    }

    public int getBalance(){
        return (int) balance;
    }

    public void setBalance(int amt){
        balance = amt;
    }

   public boolean isForeign(){
     return isforeign;
   }

   public void setForeign(boolean b){
        isforeign = b;
   }



}
