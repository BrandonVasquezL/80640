package mx.uv.c80640;

public class Usuario {
    String id;
    String nombre;
    String paswword;
    public Usuario(String id, String nombre, String paswword) {
        this.id = id;
        this.nombre = nombre;
        this.paswword = paswword;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPaswword() {
        return paswword;
    }
    public void setPaswword(String paswword) {
        this.paswword = paswword;
    }
}
