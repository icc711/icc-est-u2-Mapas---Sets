package controllers;

import java.util.*;

import models.Persona;

public class PersonaController {
    public Set <Persona> filtrarYOrdenart(
        List <Persona> personas, int edad){

            Set<Persona> personasFiltradas = new TreeSet<>(
                (p1, p2) -> {
                    int compEdad = Integer.compare(p2.getEdad(), p1.getEdad());
                    if(compEdad != 0){
                        return compEdad;
                    }
                    return p2.getNombre().compareToIgnoreCase(p1.getNombre());
                }
            );
            for (Persona persona : personas) {
                if (persona.getEdad() >= edad) {
                personasFiltradas.add(persona);
                }
            }
            return personasFiltradas;
        }

    public Map<String, Set<Persona>> agruparPorEdad(List<Persona> personas){
        
        Map<String, Set <Persona>> personasAgrupadas = new TreeMap<>();
        personasAgrupadas.put("JOVEN", new LinkedHashSet<String>());
        for (Persona persona : personas) {
            String primerNombre = persona.getNombre().split(" ")[0];


            
        }
        return agruparPorEdad(personas);
    }
}
