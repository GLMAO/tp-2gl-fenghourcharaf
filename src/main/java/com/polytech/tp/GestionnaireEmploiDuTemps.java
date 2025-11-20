package com.polytech.tp;

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
public class GestionnaireEmploiDuTemps implements Subject {
    private List<ICours> listeCours = new ArrayList<>();
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void detach(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        String message = "Nouveau cours ajouté : " + cours.getDescription();
        System.out.println(message);
        notifyObservers(message);
    }

    public void modifierCours(ICours cours, String message) {
        System.out.println("Cours modifié : " + message);
        notifyObservers("Cours modifié : " + message);
    }

    public void setChangement(String message) {
        notifyObservers(message);
=======
public class GestionnaireEmploiDuTemps {
    private List<ICours> listeCours = new ArrayList<>();

    public void ajouterCours(ICours cours) {
        this.listeCours.add(cours);
        System.out.println("Nouveau cours ajouté : " + cours.getDescription());
        // TODO: C'est ici qu'il faudrait notifier les étudiants (Observer pattern)
    }

    public void modifierCours(ICours cours, String message) {
        // Logique de modification...
        System.out.println("Cours modifié : " + message);
        // TODO: Notifier les observateurs ici aussi
    }

    public void setChangement(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setChangement'");
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    }
}