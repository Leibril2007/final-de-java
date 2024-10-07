package src.model;

public class Tarea {

    private String titulo;
    private String descripcion;
    private String fechaLimite;
    private String unEstado;

    public Tarea(String titulo, String descripcion, String fechaLimite, String unEstado){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.unEstado = unEstado;
    }

    //GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getUnEstado() {
        return unEstado;
    }
    // SETTERS


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaLimite(String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    public void setUnEstado(String unEstado) {
        this.unEstado = unEstado;
    }
}
