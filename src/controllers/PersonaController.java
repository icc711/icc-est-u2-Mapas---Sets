package controllers;

import java.util.*;

import models.Persona;

public class PersonaController {
    public Set <Persona> filtrarYOrdenar(
        List <Persona> personas, int edad){

            Set<Persona> personasFiltradas = new TreeSet<>(
                (p1, p2) -> {
                    int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
                    if(compEdad != 0){
                        return compEdad;
                    }
                    return p1.getNombre().compareToIgnoreCase(p2.getNombre());
                }
            );

            for (Persona persona : personas) {
                if (persona.getEdad() >= edad) {
                personasFiltradas.add(persona);
                }
            }
            return personasFiltradas;
        }

    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas){
        
        Map<String, Set <String>> personasAgrupadas = new TreeMap<>();
        personasAgrupadas.put("JOVEN", new LinkedHashSet<>());
        personasAgrupadas.put("ADULTO", new LinkedHashSet<>());
        personasAgrupadas.put("MAYOR", new LinkedHashSet<>());

        for (Persona persona : personas) {
            String primerNombre = persona.getNombre().split(" ")[0];
            if (persona.getEdad() < 30) {
                personasAgrupadas.get("JOVEN").add(primerNombre);
            } else if (persona.getEdad() >= 30 && persona.getEdad() < 60) {
                personasAgrupadas.get("ADULTO").add(primerNombre);
            } else {
                personasAgrupadas.get("MAYOR").add(primerNombre);
            }
        }
        return personasAgrupadas;
    }
}
