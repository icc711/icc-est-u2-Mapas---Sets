import models.Persona;
import java.util.*;

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
        personas.add(new Persona("Jose Torres", 25));
        personas.add(new Persona("Jose Torres", 25));

        personas.add(new Persona("Jose Torres", 25));

    }
}
