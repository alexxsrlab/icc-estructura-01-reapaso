package Views;

import Models.Persona;

public class viewConsole {
    
    public void printPersonArray(Persona[] personas){
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }

    public void printMessage(String message){
        System.out.println(message);
    }
}
