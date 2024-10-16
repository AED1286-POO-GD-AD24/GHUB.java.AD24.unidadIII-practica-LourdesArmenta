package empleado;

public class EmpleadoPorHoras extends Empleado{
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(){
        super();
        this.tarifaPorHora=0;
        this.horasTrabajadas=0;
        
    }

    public EmpleadoPorHoras(double tarifaPorHora, int horasTrabajadas) {
        super();
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }
    public EmpleadoPorHoras(String nombre, int edad, String tipoRelacionLaboral, double tarifaPorHora,
            int horasTrabajadas) {
            super(nombre, edad, tipoRelacionLaboral);
            this.tarifaPorHora = tarifaPorHora;
            this.horasTrabajadas = horasTrabajadas;
    }

    public EmpleadoPorHoras(String nombre, int edad, String tipoRelacionLaboral ) {
        super(nombre, edad, tipoRelacionLaboral);
        this.tarifaPorHora = 0;
        this.horasTrabajadas = 0;
        
    }

    public double getTarifaPorHora() {
        return tarifaPorHora;
    }

    public void setTarifaPorHora(double tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    
}
