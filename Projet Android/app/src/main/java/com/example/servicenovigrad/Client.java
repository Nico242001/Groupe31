package com.example.servicenovigrad;

public class Client extends Compte{
    public Client(String nom, String prenom, String dateNaissance, String email, String user, String pass){
        super(nom, prenom, dateNaissance, email, user, pass, 'C');
    }
}
