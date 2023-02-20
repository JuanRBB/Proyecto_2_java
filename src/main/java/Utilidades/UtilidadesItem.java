package Utilidades;

import Modelos.Item;
import Modelos.Personaje;

import java.util.List;

public class UtilidadesItem {

    public static void equiparItem(Personaje personaje, Item item){

        personaje.getEquipamiento().add(item);

         /*Actualizar atributos*/
        personaje.setAtaque(personaje.getAtaque() + item.getAumentoDanyo());
        personaje.setDefensa(personaje.getDefensa() + item.getAumentoDefensa());
        personaje.setVida(personaje.getVida() + item.getAumentoSalud());
        personaje.setMana(personaje.getMana() + item.getAumentoMana());

    }

}
