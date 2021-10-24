package com.example.servicenovigrad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CreeCompte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cree_compte);
    }
    
    String databaseprenom;
	String databasemotdepasse;
	String prenom;
	String nom;
	String datenai;
	String adresse;
	String type;
	String motdepasse;
	
	public CreeCompte (String p, String n, String d, String a, String t) {
		prenom = p;
		nom = n;
		datenai = d;
		adresse = a;
		type = t;
		
	}
	public void setPrenom(String p) {
		prenom = p;
	}
	
	public String getPrenom () {
		return prenom;
	}
	
	public void setNom(String n) {
		nom = n;
	}
	
	public String getNom () {
		return nom;
	}
	
	public void setDate(String d) {
		datenai = d;
	}
	
	public String getDate () {
		return datenai;
	}
	
	public void setAdresse(String a) {
		adresse = a;
	}
	
	public String getAdresse () {
		return adresse;
	}
	
	public void setType(String t) {
		type = t;
	}
	
	public String getType () {
		return type;
	}
	
	public boolean verifier() {
		if (prenom == databaseprenom && motdepasse == databasemotdepasse) {
			return true;
		}else {
			return false;
		}
	}
}
