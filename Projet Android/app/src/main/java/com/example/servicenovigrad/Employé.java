package com.example.servicenovigrad;

public class Employé extends Compte{
    public Employé(String nom, String prenom, String dateNaissance, String email, String user, String pass, char typeCompte){
        super(nom, prenom, dateNaissance, email, user, pass,'E');
    }
}
