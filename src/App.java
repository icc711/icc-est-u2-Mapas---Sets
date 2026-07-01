import models.Persona;
import java.util.*;
import controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        List <Persona> personas = new ArrayList<>();
        personas.add(new Persona("Jose Torres", 25));
        personas.add(new Persona("jose Torres", 25));
        personas.add(new Persona("JOSE torres", 25));
        personas.add(new Persona("Diego Castro", 31));
        personas.add(new Persona("diego Castro", 31));
        personas.add(new Persona("Diego castro", 31));
        personas.add(new Persona("Maria Perez", 28));
        personas.add(new Persona("maria Perez", 28));
        personas.add(new Persona("MARIA perez", 28));
        personas.add(new Persona("Ana Lopez", 22));
        personas.add(new Persona("ana Lopez", 22));
        personas.add(new Persona("Carlos Ruiz", 35));
        personas.add(new Persona("carlos Ruiz", 35));
        personas.add(new Persona("Luis Gomez", 41));
        personas.add(new Persona("luis gomez", 41));
        personas.add(new Persona("Pedro Sanchez", 29));
        personas.add(new Persona("Laura Diaz", 27));
        personas.add(new Persona("Jorge Herrera", 60));   
        personas.add(new Persona("jorge herrera", 60));   
        personas.add(new Persona("Isabel Reyes", 30));   //20
        personas.add(new Persona("Fernando Cruz", 72)); 
        personas.add(new Persona("ANA Torres", 53));
        personas.add(new Persona("Laura Ruiz", 31));
        personas.add(new Persona("Jorge Cruz", 22));
        personas.add(new Persona("Maria Sanchez", 47));
        personas.add(new Persona("ISABEL Sanchez", 71));
        personas.add(new Persona("Ricardo Mendoza", 53));
        personas.add(new Persona("luis Cruz", 61));
        personas.add(new Persona("Carlos Sanchez", 61));
        personas.add(new Persona("maria Herrera", 30)); //30
        personas.add(new Persona("Pablo Aguilar", 51));
        personas.add(new Persona("RICARDO NUNEZ", 33));
        personas.add(new Persona("maria Nunez", 55));
        personas.add(new Persona("Jorge Sanchez", 26));
        personas.add(new Persona("LAURA Vargas", 28));
        personas.add(new Persona("ANA HERRERA", 53));
        personas.add(new Persona("pablo Gomez", 65));
        personas.add(new Persona("PEDRO Fernandez", 27));
        personas.add(new Persona("ISABEL DIAZ", 38));
        personas.add(new Persona("andres Fernandez", 46)); // 40
        personas.add(new Persona("diego Diaz", 22));
        personas.add(new Persona("ANDRES Fernandez", 26));
        personas.add(new Persona("JORGE ROJAS", 45));
        personas.add(new Persona("andres Ortiz", 36));
        personas.add(new Persona("CARLOS DIAZ", 51));
        personas.add(new Persona("JORGE Herrera", 64));
        personas.add(new Persona("Carlos Silva", 81));
        personas.add(new Persona("DIEGO Lopez", 37));
        personas.add(new Persona("CAMILA AGUILAR", 26));
        personas.add(new Persona("andres Aguilar", 77)); // 50
        personas.add(new Persona("isabel Torres", 32));
        personas.add(new Persona("ELENA LOPEZ", 55));
        personas.add(new Persona("luis Ortiz", 18));
        personas.add(new Persona("Fernando Gomez", 82));
        personas.add(new Persona("MIGUEL Silva", 43));
        personas.add(new Persona("pablo Gomez", 18));
        personas.add(new Persona("valentina Torres", 32));
        personas.add(new Persona("MIGUEL Diaz", 25));
        personas.add(new Persona("JORGE PEREZ", 28));
        personas.add(new Persona("MARIA Nunez", 34)); //60
        personas.add(new Persona("valentina Nunez", 39));
        personas.add(new Persona("FERNANDO Aguilar", 72));
        personas.add(new Persona("ISABEL SANCHEZ", 57));
        personas.add(new Persona("PABLO ORTIZ", 84));
        personas.add(new Persona("Ana Diaz", 46));
        personas.add(new Persona("ELENA Torres", 47));
        personas.add(new Persona("JOSE Perez", 25));
        personas.add(new Persona("Maria Castro", 60));
        personas.add(new Persona("FERNANDO DIAZ", 53));
        personas.add(new Persona("PEDRO NUNEZ", 34)); //70
        personas.add(new Persona("LAURA Reyes", 70));
        personas.add(new Persona("ana Lopez", 73));
        personas.add(new Persona("Camila Cruz", 77));
        personas.add(new Persona("ana Castro", 69));
        personas.add(new Persona("ANA Diaz", 42));
        personas.add(new Persona("ISABEL ORTIZ", 35));
        personas.add(new Persona("LUIS Fernandez", 77));
        personas.add(new Persona("Maria Ortiz", 30));
        personas.add(new Persona("ISABEL Torres", 29));
        personas.add(new Persona("LUIS CRUZ", 80)); //80
        personas.add(new Persona("PEDRO Herrera", 25));
        personas.add(new Persona("andres Torres", 67));
        personas.add(new Persona("RICARDO VARGAS", 72));
        personas.add(new Persona("CARLOS Sanchez", 55));
        personas.add(new Persona("diego Mendoza", 25));
        personas.add(new Persona("DIEGO Castro", 79));
        personas.add(new Persona("DIEGO Silva", 28));
        personas.add(new Persona("MARIA Aguilar", 26));
        personas.add(new Persona("Andres Lopez", 49));
        personas.add(new Persona("patricia Perez", 71)); // 90
        personas.add(new Persona("SOFIA Sanchez", 58));
        personas.add(new Persona("sofia Herrera", 34));
        personas.add(new Persona("Ricardo Rojas", 27));
        personas.add(new Persona("Ricardo Aguilar", 30));
        personas.add(new Persona("isabel Sanchez", 82));
        personas.add(new Persona("CARLOS Morales", 26));
        personas.add(new Persona("PABLO VARGAS", 38));
        personas.add(new Persona("isabel Vargas", 19));
        personas.add(new Persona("Ana Ruiz", 51));
        personas.add(new Persona("ana Nunez", 37)); // 100

        PersonaController controller = new PersonaController();

        Set<Persona> personasFiltradas = controller.filtrarYOrdenar(personas, 50);
        Map<String, Set<String>> personasAgrupadas = controller.agruparPorRangoEdad(personas);

        System.out.println("PERSONAS FILTRADAS:");
        for(Persona p : personasFiltradas){
            System.out.println(p);
        }

        System.out.println("\nPERSONAS AGRUPADAS:");
        System.out.println(personasAgrupadas);
    }
}
