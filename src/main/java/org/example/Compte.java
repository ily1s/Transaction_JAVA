package org.example;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Compte {
    private String numcompte;
    private double solde;
    private Timestamp dateCreation;
    private Timestamp dateupdate;
    private Client client;
    private List<Transaction> transactions;

    public Compte(String numcompte, double solde) {
        this.numcompte = numcompte;
        this.solde = solde;
    }

    public String getNumCompte() {
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

    public void setNumcompte(String numcompte) {
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
