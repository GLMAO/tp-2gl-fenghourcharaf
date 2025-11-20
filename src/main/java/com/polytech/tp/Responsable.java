package com.polytech.tp;

<<<<<<< HEAD
public class Responsable implements Observer {
=======
public class Responsable {
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    private String nom;

    public Responsable(String nom) {
        this.nom = nom;
    }

<<<<<<< HEAD
    @Override
    public void update(String message) {
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }
}
=======
    
    public void update(String message) {
        System.out.println("Notification pour le responsable " + nom + " : " + message);
    }
}
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
