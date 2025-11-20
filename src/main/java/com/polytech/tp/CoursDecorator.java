package com.polytech.tp;

public abstract class CoursDecorator implements ICours {
    protected ICours coursDecorated;

    public CoursDecorator(ICours cours) {
        this.coursDecorated = cours;
    }
    
<<<<<<< HEAD
    @Override
    public String getDescription() {
        return coursDecorated.getDescription();
    }
    
    @Override
    public double getDuree() {
        return coursDecorated.getDuree();
    }
=======
    // TODO: Forcer l'implémentation des méthodes de ICours
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
}