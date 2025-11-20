package com.polytech.tp;

<<<<<<< HEAD
public class Etudiant implements Observer {
=======
public class Etudiant {
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

<<<<<<< HEAD
    @Override
=======
    
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    public void update(String message) {
        System.out.println("Notification pour l'étudiant " + nom + " : " + message);
    }
}