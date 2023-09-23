package project.paws.connect.model;

public class Mascota {
    private Long id;
    private String nombre;
    private String tipo;

    private Long usuarioId;

    public Mascota(String nombre, String tipo) {
        setNombre(nombre);
        setTipo(tipo);
    }

    public Mascota() {

    }

    public String getNombre() {
        return nombre;
    }

    public Long getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}