package com.example.servicenovigrad;

public class Compte {
    private String nom;
    private String prenom;
    private String dateNaissance;
    private String email;
    private String user;
    private String pass;

    private char typeCompte;

    public Compte(String nom, String prenom, String dateNaissance, String email, String user, String pass, char typeCompte){
        setNom(nom);
        setPrenom(prenom);
        setTypeCompte(typeCompte);
        setEmail(email);
        setDateNaissance(dateNaissance);
        setUser(user);
        setPass(pass);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getNom() {
        return nom;
    }

    public String getPass() {
        return pass;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getUser() {
        return user;
    }

    public char getTypeCompte() {
        return typeCompte;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTypeCompte(char typeCompte) {
        this.typeCompte = typeCompte;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
