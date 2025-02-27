package entities;

import java.util.ArrayList;

public class Professeur {
    public Professeur() {
    }
    private int id;
    private String nom;
    private String prenom;
    private String tel;
    private ArrayList<Cours> cours;


    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public ArrayList<Cours> getCours() {
        return cours;
    }
    public void setCours(ArrayList<Cours> cours) {
        this.cours = cours;
    }
}



