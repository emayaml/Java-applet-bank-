/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg004TIbanco;

import java.util.Date;

/**
 *
 * @author @emayaml
 */
public class SavingsAccount {
    
    //private Date dueDatea;
    private String dueDate;
    private double interestPercentage;
    
    //GET Y  SET 

    public String getDueDate() {
        return dueDate;
    }

    public double getInterestPercentage() {
        return interestPercentage;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public void setInterestPercentage(double interestPercentage) {
        this.interestPercentage = interestPercentage;
    }
    
    //TOSTRING CONSTRUCTOR

    public SavingsAccount(String dueDate, double interestPercentage) {
        this.dueDate = dueDate;
        this.interestPercentage = interestPercentage;
    }

    public String toString() {
        return "SavingsAccount{" + "dueDate=" + dueDate + ", interestPercentage=" + interestPercentage + '}';
    }
    
    
}
