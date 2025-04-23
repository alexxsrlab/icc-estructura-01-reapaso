
import Controllers.PersonaController;
import Models.Persona;
import Views.viewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas  = new Persona[] {
            new Persona("Juan",25),
            new Persona("Maria",30),
            new Persona("Carlos",22),
            new Persona("Ana",28),
            new Persona("Luis",35),
            new Persona("Sofia",27),
            new Persona("Miguel",40),
            new Persona("Laura",32),
            new Persona("Pedro",29),
            new Persona("Elena",26),
        };

        PersonaController pC = new PersonaController();
        viewConsole vC = new viewConsole();

        vC.printMessage("Arreglo Personas");
        vC.printPersonArray(personas);
        System.out.println("\nArreglo ordenado Ascendentemente");
        pC.ordenarPorEdad(personas);
        vC.printPersonArray(personas);
        vC.printMessage("\nBuscar persona con edad 40");
        Persona personaBuscada = pC.buscarPorEdad(personas, 40);
        if(personaBuscada == null){
            vC.printMessage("No se encontro persona con edad 40");
        }else{
            vC.printMessage("Se encontro persona con edad 40");
            vC.printMessage(personaBuscada.toString());
        }
        /// TODO: GENERAR INSTNACIA DE CONTROLLE Y ORDENAR EL METODO DESPUES BUSCAR POR
        /// LA EDAD

    }
}
