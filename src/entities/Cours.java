package entities;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cours {
    public Cours() {
    }
    private int id;
    private LocalDate date;
    private LocalTime heureDb;
    private LocalTime heureFin;
    private Module module;
    private Professeur professeur;


    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public LocalTime getHeureDb() {
        return heureDb;
    }
    public void setHeureDb(LocalTime heureDb) {
        this.heureDb = heureDb;
    }
    public LocalTime getHeureFin() {
        return heureFin;
    }
    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }
    public Module getModule() {
        return module;
    }
    public void setModule(Module module) {
        this.module = module;
    }
    public Professeur getProfesseur() {
        return professeur;
    }
    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }



    
}
