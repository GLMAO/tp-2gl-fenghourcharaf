package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {
<<<<<<< HEAD
    
    public CoursEnLigne(ICours cours) {
        super(cours);
=======
    CoursEnLigne(ICours cours) {
        //TODO: Implémenter le reste ...
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    }

    @Override
    public String getDescription() {
<<<<<<< HEAD
        return coursDecorated.getDescription() + " (En ligne)";
=======
        // TODO Auto-generated method stub
        
        return null;
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
    }

    @Override
    public double getDuree() {
<<<<<<< HEAD
        return coursDecorated.getDuree();
    }
}
=======
        // TODO Auto-generated method stub
        
        return 0;
    };
}
>>>>>>> e6f6653991ffce44a3bc063740ee3ccd63240189
