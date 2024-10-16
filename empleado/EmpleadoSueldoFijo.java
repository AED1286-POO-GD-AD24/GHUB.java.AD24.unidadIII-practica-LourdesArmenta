package empleado;

public class EmpleadoSueldoFijo extends Empleado{
    private double sueldoFijo;

    public EmpleadoSueldoFijo(){
        super();
        this.sueldoFijo = 0;
    }
   
    public EmpleadoSueldoFijo(String nombre, int edad, String tipoRelacionLaboral) {
        super(nombre, edad, tipoRelacionLaboral);
        this.sueldoFijo=0;
    }

    public EmpleadoSueldoFijo(double sueldoFijo) {
        super();
        this.sueldoFijo = sueldoFijo;
    }

    public EmpleadoSueldoFijo(String nombre, int edad, String tipoRelacionLaboral,
                 double sueldoFijo) {
        super(nombre, edad, tipoRelacionLaboral);
        this.sueldoFijo = sueldoFijo;
    }
   

    public double getSueldoFijo() {
        return sueldoFijo;
    }

    public void setSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }
    
    
    




    
}
