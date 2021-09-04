package services;

import daos.CRUDAccount;
import models.Account;

import java.util.ArrayList;

public class ManageAccount {
    public static ArrayList<Account> listAccount = new ArrayList<>();

    public ManageAccount() {
        try {
            listAccount = (ArrayList<Account>) CRUDAccount.showAccount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(Account account) throws Exception{
        CRUDAccount.createAccount(account);
        listAccount.add(account);
    }

}
