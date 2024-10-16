package empleado;

public class Empleado {
    private String nombre;
    private int edad;
    private String tipoRelacionLaboral;

    public Empleado() {
        this.nombre = "Sin Nombre";
        this.edad=0;
        this.tipoRelacionLaboral="Sin Relacion";
    }

    public Empleado(String nombre, int edad, String tipoRelacionLaboral) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoRelacionLaboral = tipoRelacionLaboral;
    }

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

    public String getTipoRelacionLaboral() {
        return tipoRelacionLaboral;
    }

    public void setTipoRelacionLaboral(String tipoRelacionLaboral) {
        this.tipoRelacionLaboral = tipoRelacionLaboral;
    }
    
    
    

    
}
