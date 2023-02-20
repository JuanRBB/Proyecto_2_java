package Utilidades;

import Modelos.Habilidad;
import Modelos.Item;
import Modelos.Personaje;

import java.util.List;
import java.util.Objects;

public class UtilidadesHabilidad {

    public void golpearConHabilidad(Personaje emisor, Personaje receptor, Habilidad habilidadEmisor){

        //Actualización del nivel
        UtilidadesPersonaje.levelTo(emisor,18);
        UtilidadesPersonaje.levelTo(receptor,18);

        // Comprobación de atributos
        for(Item objeto: emisor.getEquipamiento()){
            UtilidadesItem.equiparItem(receptor, objeto);
        }

        for(Item objeto: receptor.getEquipamiento()){
            UtilidadesItem.equiparItem(receptor, objeto);
        }

        // Calcular la habilidad
        Double potenciaAtaque = habilidadEmisor.getDanyoBase() + (0.2* emisor.getAtaque()) - (0.1* receptor.getDefensa());

        // Actualizamos
        emisor.setMana(emisor.getMana() - habilidadEmisor.getCosteMana());
        receptor.setVida(receptor.getVida() - potenciaAtaque);

    }


}
