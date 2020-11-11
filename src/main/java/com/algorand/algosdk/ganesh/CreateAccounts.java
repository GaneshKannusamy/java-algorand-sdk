package com.algorand.algosdk.ganesh;

import com.algorand.algosdk.account.Account;

public class CreateAccounts
{
    public static void main(String args[]) throws Exception {
        try {
            Account myAccount1 = new Account();
            System.out.println("My Address1: " + myAccount1.getAddress());
            System.out.println("My Passphrase1: " + myAccount1.toMnemonic());
            // 7WPIOWPCPXW5JVLMKZIUGB3EDMVS7BNIONTWOOYADITWYPKBVRLQ
            Account myAccount2 = new Account();
            System.out.println("My Address2: " + myAccount2.getAddress());
            System.out.println("My Passphrase2: " + myAccount2.toMnemonic());
            // CUXLJED23PXTINK224X2AS7VH3E3UQ24MXA6YRTSYQ6NPT6BGA4A
            Account myAccount3 = new Account();
            System.out.println("My Address3: " + myAccount3.getAddress());
            System.out.println("My Passphrase3: " + myAccount3.toMnemonic());
            // TOOSEKZFUAPHW5YR7UMILTVXRISWTHEG6MRRZPRXIFVU6RMELC5A
            // DN427A6QRYGVBBY4E536YW77FO4GH4NIR2UT4WCB4P6ZBFSHB4RQ
            //Copy off accounts and mnemonics
            //Dispense TestNet Algos to each account: https://bank.testnet.algorand.network/
            // resource:
            // https://developer.algorand.org/docs/features/accounts/create/#standalone
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}
