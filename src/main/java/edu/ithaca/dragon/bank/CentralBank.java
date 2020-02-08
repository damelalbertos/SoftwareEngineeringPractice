package edu.ithaca.dragon.bank;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

public class CentralBank implements BasicAPI, AdvancedAPI, AdminAPI {

    private String bankName;
    private HashMap<String, Double> bankAccounts;

    public CentralBank(String bankName, HashMap<String, Double> bankAccounts){
       this.bankName = bankName;
       this.bankAccounts = new HashMap<String, Double>();
    }



    //----------------- BasicAPI methods -------------------------//

    public boolean confirmCredentials(String acctId, String password) {
        return false;
    }

    /**
     * Returns balance associated with ID if it exists
     * @param acctId
     * @return balance in account if it exists
     * @throws IllegalArgumentException if ID does not exist
     */
    public double checkBalance(String acctId) {
        return 0;
    }


    public void withdraw(String acctId, double amount) throws InsufficientFundsException {

    }

    public void deposit(String acctId, double amount) {

    }

    public void transfer(String acctIdToWithdrawFrom, String acctIdToDepositTo, double amount) throws InsufficientFundsException {

    }

    public String transactionHistory(String acctId) {
        return null;
    }


    //----------------- AdvancedAPI methods -------------------------//

    /**
     * Creates account and adds it to central bank's hash map of accounts if account is valid
     * @param acctId
     * @param startingBalance
     * @throws IllegalArgumentException if ID already exists or balance isn't valid
     */
    public void createAccount(String acctId, double startingBalance) {

    }

    public void closeAccount(String acctId) {

    }


    //------------------ AdminAPI methods -------------------------//

    public double calcTotalAssets() {
        return 0;
    }

    public Collection<String> findAcctIdsWithSuspiciousActivity() {
        return null;
    }

    public void freezeAccount(String acctId) {

    }

    public void unfreezeAcct(String acctId) {

    }

}
