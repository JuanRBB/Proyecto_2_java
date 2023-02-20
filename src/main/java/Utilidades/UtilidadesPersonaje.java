package Utilidades;

import Modelos.Personaje;
import Modelos.Region;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilidadesPersonaje {

    public Personaje levelUp (Personaje personaje){

        Personaje personajeEvolucionado = new Personaje();

        // Evolución del nivel del personaje
        personajeEvolucionado.setNivel(personaje.getNivel() + 1);

        //Actualización de las estadisticas del personajeEvolucionado en función de la ecucacion EstadisticaBase + EscalabilidadEstadistica * nivel
        personajeEvolucionado.setAtaqueBase((personaje.getAtaqueBase()+ personaje.getEscalabilidad().getIncrementoDanyoNivel() )* personajeEvolucionado.getNivel());
        personajeEvolucionado.setDefensaBase((personaje.getDefensaBase()+personaje.getEscalabilidad().getIncrementoDefensaNivel()) * personajeEvolucionado.getNivel());
        personajeEvolucionado.setManaBase(personaje.getManaBase()+personaje.getEscalabilidad().getIncrementoManaNivel() * personajeEvolucionado.getNivel());
        personajeEvolucionado.setVidaBase(personaje.getVidaBase()+personaje.getEscalabilidad().getIncrementoSaludNivel() * personajeEvolucionado.getNivel());

        return personajeEvolucionado;
    }

    public static void levelTo (Personaje personaje, Integer nivel){

        Personaje personajeEvolucionado = new Personaje();

        // Evolución del nivel del personaje
        personajeEvolucionado.setNivel(personaje.getNivel() + nivel);

        //Actualización de las estadisticas del personajeEvolucionado en función de la ecucacion EstadisticaBase + EscalabilidadEstadistica * nivel
        personajeEvolucionado.setAtaqueBase((personaje.getAtaqueBase()+ personaje.getEscalabilidad().getIncrementoDanyoNivel() )* personajeEvolucionado.getNivel());
        personajeEvolucionado.setDefensaBase((personaje.getDefensaBase()+personaje.getEscalabilidad().getIncrementoDefensaNivel()) * personajeEvolucionado.getNivel());
        personajeEvolucionado.setManaBase(personaje.getManaBase()+personaje.getEscalabilidad().getIncrementoManaNivel() * personajeEvolucionado.getNivel());
        personajeEvolucionado.setVidaBase(personaje.getVidaBase()+personaje.getEscalabilidad().getIncrementoSaludNivel() * personajeEvolucionado.getNivel());
    }

    public Map<Region, List<Personaje>> getPersonajesPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>>  jugadoresAgrupados = new HashMap<>();

        for (Personaje personaje : personajes){

            if (jugadoresAgrupados.containsKey(personaje.getRegion())){
                jugadoresAgrupados.get(personaje.getRegion()).add(personaje);
            }
            else{
                jugadoresAgrupados.put(personaje.getRegion(), List.of(personaje));
            }
        }
        return jugadoresAgrupados;
    }

    public Personaje getMasPoderoso(List<Personaje> personaje){

        Personaje personajeFuerte = new Personaje();

        for (Personaje personaje1: personaje){
            //Creamos un nuevo personaje y variable de sumaEstadistica
            Personaje personajeX = new Personaje();
            Double sumaEstadistica = 0.0;

            // Evolución del nivel del personaje
            personajeX.setNivel(personaje1.getNivel() + 18);

            //Actualización de las estadisticas del personajeEvolucionado en función de la ecucacion EstadisticaBase + EscalabilidadEstadistica * nivel
            personajeX.setAtaqueBase((personaje1.getAtaqueBase()+ personaje1.getEscalabilidad().getIncrementoDanyoNivel() )* personajeX.getNivel());
            personajeX.setDefensaBase((personaje1.getDefensaBase()+personaje1.getEscalabilidad().getIncrementoDefensaNivel()) * personajeX.getNivel());
            personajeX.setManaBase(personaje1.getManaBase()+personaje1.getEscalabilidad().getIncrementoManaNivel() * personajeX.getNivel());
            personajeX.setVidaBase(personaje1.getVidaBase()+personaje1.getEscalabilidad().getIncrementoSaludNivel() * personajeX.getNivel());

            // Calculamos la estadistica del nuevo personaje
            sumaEstadistica = personajeX.getAtaqueBase() + personajeX.getDefensaBase() + personajeX.getManaBase() + personajeX.getVidaBase();

            // Comparamos la estadistica del juevo personaje con la del personaje anterior.
            if (sumaEstadistica > (personajeFuerte.getAtaqueBase() + personajeFuerte.getVidaBase() + personajeFuerte.getManaBase() + personajeFuerte.getDefensaBase())){
                personajeFuerte = personajeX;
            }
        }
        return personajeFuerte;
    }

    public Map<Region, List<Personaje>> getMasPoderosoPorRegion(List<Personaje> personajes){

        Map<Region, List<Personaje>> personajesPoderososPorRegion = new HashMap<>();
        List<Personaje> personajeFuerteRegion = new ArrayList<>();

       /* for (Personaje personaje : personajes){

            if (personajesPoderososPorRegion.containsKey(personaje.getRegion())){
                personajesPoderososPorRegion.get(personaje.getRegion()).add(getMasPoderoso(getPersonajesPorRegion().values()));
            }
            else{
                personajesPoderososPorRegion.put(personaje.getRegion(), List.of(getMasPoderoso(personajes)));
            }
        }*/

        return personajesPoderososPorRegion;
    }


}
