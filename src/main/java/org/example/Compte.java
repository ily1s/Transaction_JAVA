package org.example;

import java.sql.Timestamp;
import java.util.List;

public class Compte {
    private int numcompte;
    private double solde;
    private Timestamp dateCreation;
    private Timestamp dateupdate;
    private Client client;
    private List<Transaction> transactions;

    public Compte(int numcompte, double solde, Timestamp dateCreation, Timestamp dateupdate) {
        this.numcompte = numcompte;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.dateupdate = dateupdate;
    }

    public int getNumcompte() {
        return numcompte;
    }

    public Timestamp getDateCreation() {
        return dateCreation;
    }

    public Timestamp getDateupdate() {
        return dateupdate;
    }

    public double getSolde() {
        return solde;
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

    public void setSolde(double solde) {
        this.solde = solde;
    }
}
