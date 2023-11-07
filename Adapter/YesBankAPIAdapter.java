package Adapter;

import Adapter.thirdparty.yesbank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String accountNumber) {
        return 0;
    }
}
