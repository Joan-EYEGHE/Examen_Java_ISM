package entities;

import java.util.ArrayList;

public class Module {
    public Module() {
    }
    
    private int id;
    private String nom;
    private ArrayList<Cours> Cours;

    
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
    public ArrayList<Cours> getCours() {
        return Cours;
    }
    public void setCours(ArrayList<Cours> cours) {
        Cours = cours;
    }
}
