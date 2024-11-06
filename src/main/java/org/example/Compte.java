package org.example;

import java.sql.Timestamp;
import java.util.List;

public class Compte {
    private int numcompte;
    private Timestamp dateCreation;
    private Timestamp dateupdate;
    private String devise;
    private Client client;
    private List<Transaction> transactions;

    public int getNumcompte() {
        return numcompte;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public Timestamp getDateupdate() {
        return dateupdate;
    }

    public String getDevise() {
        return devise;
    }

    public void setNumcompte(int numcompte) {
        this.numcompte = numcompte;
    }

    public void setDateCreation(Timestamp dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setDateupdate(Timestamp dateupdate) {
        this.dateupdate = dateupdate;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }
}
