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
public class CheckAccount {
    
    private double commisionUse;
    private double commissionEmission;
    
    //SET Y GET 

    public void setCommisionUse(double commisionUse) {
        this.commisionUse = commisionUse;
    }

    public void setCommissionEmission(double commissionEmission) {
        this.commissionEmission = commissionEmission;
    }

    public double getCommisionUse() {
        return commisionUse;
    }

    public double getCommissionEmission() {
        return commissionEmission;
    }
    
    
    //CONSTRUCTOR Y TO STRING


    public String toString() {
        return "CheckAccount{" + "commisionUse=" + commisionUse + ", commissionEmission=" + commissionEmission + '}';
    }

    public CheckAccount(double commisionUse, double commissionEmission) {
        this.commisionUse = commisionUse;
        this.commissionEmission = commissionEmission;
    }
    
    
}
