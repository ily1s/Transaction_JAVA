package org.example;

import java.util.List;

public class Client {
    private String numClient;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String email;
    private List<Compte> comptes;

    // No-argument constructor (required for Jackson)
    public Client() {}

    public Client(String numClient, String nom) {
        this.numClient = numClient;
        this.nom = nom;
    }

    public String getNumClient() {
        return numClient;
    }

    public String getNomClient() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setNumClient(String numClient) {
        this.numClient = numClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
