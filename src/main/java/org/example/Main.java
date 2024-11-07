package org.example;

public class Main {
    public static void main(String[] args) {
        Bank Bank1 = new Bank("CIH");
        Bank Bank2 = new Bank("CIH");

        Client client1 = new Client("1","Alice");
        Client client2 = new Client("2","Bob");

        Compte compte1 = new Compte("11111", 1000.0);
        Compte compte2 = new Compte("22222", 500.0);

        Bank1.ajouterClient(client1);
        Bank1.creerCompte(compte1);

        Bank2.ajouterClient(client2);
        Bank2.creerCompte(compte2);

        // Transaction with automatic type determination
        Transaction transaction = new Transaction(compte1, compte2, 100.0, Bank1, Bank2, "Maroc", "Maroc");

        System.out.println(transaction.getType());
    }
}