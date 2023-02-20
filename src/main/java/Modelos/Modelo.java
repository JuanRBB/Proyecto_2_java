package Modelos;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Modelo {
    private int id;
    private String codigo;
    private Double server;
    private Map<Jugador, Personaje> elecciones;
    private Map<Integer, Set<Jugador>> jugadoresPorEquipo;
    private LocalDate inicioPartida;
    private LocalDate finPartida;
    private int duracionPartida;
    private Integer equipoVencedor;

    public Modelo() {
    }

    public Modelo(int id, String codigo, Double server, Map<Jugador, Personaje> elecciones, Map<Integer, Set<Jugador>> jugadoresPorEquipo, LocalDate inicioPartida, LocalDate finPartida, int duracionPartida, Integer equipoVencedor) {
        this.id = id;
        this.codigo = codigo;
        this.server = server;
        this.elecciones = elecciones;
        this.jugadoresPorEquipo = jugadoresPorEquipo;
        this.inicioPartida = inicioPartida;
        this.finPartida = finPartida;
        this.duracionPartida = duracionPartida;
        this.equipoVencedor = equipoVencedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getServer() {
        return server;
    }

    public void setServer(Double server) {
        this.server = server;
    }

    public Map<Jugador, Personaje> getElecciones() {
        return elecciones;
    }

    public void setElecciones(Map<Jugador, Personaje> elecciones) {
        this.elecciones = elecciones;
    }

    public Map<Integer, Set<Jugador>> getJugadoresPorEquipo() {
        return jugadoresPorEquipo;
    }

    public void setJugadoresPorEquipo(Map<Integer, Set<Jugador>> jugadoresPorEquipo) {
        this.jugadoresPorEquipo = jugadoresPorEquipo;
    }

    public LocalDate getInicioPartida() {
        return inicioPartida;
    }

    public void setInicioPartida(LocalDate inicioPartida) {
        this.inicioPartida = inicioPartida;
    }

    public LocalDate getFinPartida() {
        return finPartida;
    }

    public void setFinPartida(LocalDate finPartida) {
        this.finPartida = finPartida;
    }

    public int getDuracionPartida() {
        return duracionPartida;
    }

    public void setDuracionPartida(int duracionPartida) {
        this.duracionPartida = duracionPartida;
    }

    public Integer getEquipoVencedor() {
        return equipoVencedor;
    }

    public void setEquipoVencedor(Integer equipoVencedor) {
        this.equipoVencedor = equipoVencedor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return id == modelo.id && duracionPartida == modelo.duracionPartida && Objects.equals(codigo, modelo.codigo) && Objects.equals(server, modelo.server) && Objects.equals(elecciones, modelo.elecciones) && Objects.equals(jugadoresPorEquipo, modelo.jugadoresPorEquipo) && Objects.equals(inicioPartida, modelo.inicioPartida) && Objects.equals(finPartida, modelo.finPartida) && Objects.equals(equipoVencedor, modelo.equipoVencedor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codigo, server, elecciones, jugadoresPorEquipo, inicioPartida, finPartida, duracionPartida, equipoVencedor);
    }

    @Override
    public String toString() {
        return "Modelo{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", server=" + server +
                ", elecciones=" + elecciones +
                ", jugadoresPorEquipo=" + jugadoresPorEquipo +
                ", inicioPartida=" + inicioPartida +
                ", finPartida=" + finPartida +
                ", duracionPartida=" + duracionPartida +
                ", equipoVencedor=" + equipoVencedor +
                '}';
    }
}
