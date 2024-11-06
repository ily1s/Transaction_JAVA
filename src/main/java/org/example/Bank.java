package org.example;

import java.util.List;

public class Bank {
    private String bankName;
    private String ID;
    private String pays;
    private List<Compte> comptes;

    public Bank(String bankName, String ID, String pays) {
        this.bankName = bankName;
        this.ID = ID;
        this.pays = pays;
    }

    public String getBankName() {
        return bankName;
    }

    public String getID() {
        return ID;
    }

    public String getPays() {
        return pays;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
