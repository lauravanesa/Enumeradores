public class Persona {
    private String nombre;
    private int edad;
    private String telefono;
    private estadoCivil estadoCivil;
    private Genero Genero;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public estadoCivil getEstadoCivil() {
        return estadoCivil;
    }




    public void setEstadoCivil(estadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;

    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero genero) {
        Genero = genero;
    }
}

