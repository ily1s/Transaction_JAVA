package org.example;

public class BankSystem {
    public static void main(String[] args) {
        // Create a sample client and account
        Bank banque1 = new Bank("CIH");
        Client client = new Client("1", "Alice");
        Compte compte1 = new Compte("11111", 1000.0);
        Compte compte2 = new Compte("22222", 500.0);

        Transaction transaction = new Transaction(compte1, compte2, 100.0, banque1, banque1, "France", "France");

        // Convert client to JSON
        String clientJson = JsonConverter.toJson(client);
        System.out.println("Client JSON: " + clientJson);

        // Convert account to JSON
        String compteJson = JsonConverter.toJson(compte1);
        System.out.println("Compte JSON: " + compteJson);

        // Convert transaction to JSON
        String transactionJson = JsonConverter.toJson(transaction);
        System.out.println("Transaction JSON: " + transactionJson);
    }
}
