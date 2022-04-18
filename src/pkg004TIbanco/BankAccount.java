/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg004TIbanco;

/**
 *
 * @author @emayaml
 */
public class BankAccount {
    
            
            private int numberAccount;
            private String nameClient;
            private int balance;
            private String type;
            
            
            //GET Y SET 

    public int getBalance() {
        return balance;
    }

    public String getNameClient() {
        return nameClient;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
            //CONSTRUCTOR

    public BankAccount(int numberAccount, String nameClient, int balance, String type) {
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
        this.balance = balance;
        this.type = type;
    }

    
    
    
    //TOSTRING

    @Override
    public String toString() {
        return "BankAccount{" + "numberAccount=" + numberAccount + ", nameClient=" + nameClient + ", balance=" + balance + ", type=" + type + '}';
    }

}