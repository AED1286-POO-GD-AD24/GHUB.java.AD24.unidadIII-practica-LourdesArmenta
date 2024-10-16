package empleado;

public class EmpleadoComision extends Empleado{
    private double comision;
    private int ventasRealizadas;

    public EmpleadoComision(){
        super();
        this.comision=0;
        this.ventasRealizadas=0;
    }

    public EmpleadoComision(String nombre, int edad, String tipoRelacionLaboral ){
        super(nombre, edad,tipoRelacionLaboral );
        this.comision=0;
        this.ventasRealizadas=0;

    }

    public EmpleadoComision(double comision, int ventasRealizadas) {
        super();
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }
    public EmpleadoComision(String nombre, int edad, String tipoRelacionLaboral, double comision,
            int ventasRealizadas) {
        super(nombre, edad, tipoRelacionLaboral);
        this.comision = comision;
        this.ventasRealizadas = ventasRealizadas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    
    
    
}
