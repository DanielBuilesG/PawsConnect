package project.paws.connect.model;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private Long id;
    private String nombre;
    private String correoElectronico;
    private Map<Long, Mascota> mascotas = new HashMap<>();

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Map<Long, Mascota> getMascotas() {
        return mascotas;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setMascotas(Map<Long, Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}