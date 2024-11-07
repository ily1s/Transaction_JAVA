package org.example;

import java.sql.Timestamp;

public class Transaction {
    public enum Type {VIRINT, VIREST, VIRMULTA}

    private String type;
    private Timestamp timestamp;
    private int reference;
    private Compte sourceCompte;
    private Compte destinationCompte;
    private double montant;
    private Bank sourceBanque;
    private Bank destinationBanque;
    private String paysSource;
    private String paysDestination;

    public Transaction(Compte sourceCompte, Compte destinationCompte, double montant, Bank sourceBanque, Bank destinationBanque, String paysSource, String paysDestination) {
        this.sourceCompte = sourceCompte;
        this.destinationCompte = destinationCompte;
        this.montant = montant;
        this.sourceBanque = sourceBanque;
        this.destinationBanque = destinationBanque;
        this.paysSource = paysSource;
        this.paysDestination = paysDestination;
    }

    public Type getType() {
        // VirInt: same bank code
        // VirEst: same country different bank
        // VirMulta: different Countries
        if (sourceBanque.getBankName().equals(destinationBanque.getBankName()) && paysSource.equals(paysDestination)) {
            return Type.VIRINT;  // Same bank
        } else if (!sourceBanque.getBankName().equals(destinationBanque.getBankName()) && paysSource.equals(paysDestination)) {
            return Type.VIREST;  // Different banks
        } else if (!paysSource.equals(paysDestination)) {
            return Type.VIRMULTA;  //Diffrent country
        }
        return null;
    }

    public Compte getSourceCompte() {
        return sourceCompte;
    }

    public Compte getDestinationCompte() {
        return destinationCompte;
    }

    public double getMontant() {
        return montant;
    }

    public Bank getSourceBanque() {
        return sourceBanque;
    }

    public Bank getDestinationBanque() {
        return destinationBanque;
    }

    public String getPaysSource() {
        return paysSource;
    }

    public String getPaysDestination() {
        return paysDestination;
    }
}
