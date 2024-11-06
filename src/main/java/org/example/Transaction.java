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

    public Transaction(String type, Timestamp timestamp, int reference, Compte sourceCompte, Compte destinationCompte, double montant, Bank sourceBanque, Bank destinationBanque, String paysSource, String paysDestination) {
        this.type = type;
        this.timestamp = timestamp;
        this.reference = reference;
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
        if (sourceBanque.equals(destinationBanque)) {
            return Type.VIRINT;  // Same bank
        } else if (!sourceBanque.equals(destinationBanque)) {
            return Type.VIREST;  // Different banks
        } else if (!paysSource.equals(paysDestination)) {
            return Type.VIRMULTA;  //Diffrent country
        }
        return null;  // In case none of the conditions are met
    }


    public Timestamp getTimestamp() {
        return timestamp;
    }

    public int getReference() {
        return reference;
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

    public void setType(String type) {
        this.type = type;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public void setReference(int reference) {
        this.reference = reference;
    }

    public void setSourceCompte(Compte sourceCompte) {
        this.sourceCompte = sourceCompte;
    }

    public void setDestinationCompte(Compte destinationCompte) {
        this.destinationCompte = destinationCompte;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public void setSourceBanque(Bank sourceBanque) {
        this.sourceBanque = sourceBanque;
    }

    public void setDestinationBanque(Bank destinationBanque) {
        this.destinationBanque = destinationBanque;
    }

    public void setPaysSource(String paysSource) {
        this.paysSource = paysSource;
    }

    public void setPaysDestination(String paysDestination) {
        this.paysDestination = paysDestination;
    }
}
