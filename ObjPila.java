public class ObjPila {
    private String Nombre;
    private String Apellido;
    private String Direccion;
    private Double Salario;

    public ObjPila() {
    }

    public ObjPila(String nombre, String apellido, String direccion, Double salario) {
        Nombre = nombre;
        Apellido = apellido;
        Direccion = direccion;
        Salario = salario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public Double getSalario() {
        return Salario;
    }

    public void setSalario(Double salario) {
        Salario = salario;
    }

}