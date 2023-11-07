package Adapter;

public class PhonePe {

    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }

    public double doSomething(){
        double currBalance = bankAPI.getBalance("dummy");
        return currBalance*2;
    }

}
