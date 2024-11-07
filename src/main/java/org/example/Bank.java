package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Bank {
    private String bankName;
    private String ID;
    private String pays;
    private ArrayList<Client> clients = new ArrayList<>();
    private ArrayList<Compte> comptes = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void ajouterClient(Client client) {
        clients.add(client);
    }

    public Client rechercherClient(String nomClient) {
        for (Client client : clients) {
            if (client.getNomClient().equals(nomClient)) {
                return client;
            }
        }
        return null; // Client not found
    }

    public void creerCompte(Compte compte) {
        comptes.add(compte);
    }

    public Compte getCompte(String numCompte) {
        for (Compte compte : comptes) {
            if (Objects.equals(compte.getNumCompte(), numCompte)) {
                return compte;
            }
        }
        return null; // Account not found
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
