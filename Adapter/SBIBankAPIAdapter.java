package Adapter;

import Adapter.thirdparty.yesbank.YesBankAPI;

public class SBIBankAPIAdapter implements BankAPIAdapter{
    private SBIBankAPIAdapter SBIBankAPIAdapter = new SBIBankAPIAdapter();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }
}
