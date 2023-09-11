package Entidades;

public class Persona {

    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer documento;

    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        if (perro != null) {
            return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", Documento: " + documento + ", Perro: " + perro.getNombre();
        } else {
            return "Nombre: " + nombre + " " + apellido + ", Edad: " + edad + ", Documento: " + documento + ", Perro: No tiene perro";
        }
    }
    
    public void adoptarPerro(Perro perro) {
        if (perro != null && !perro.isAdoptado()) {
            this.perro = perro;
            perro.adoptar();
        } else {
            System.out.println("El perro ya está adoptado o no existe.");
        }
    }
}
