package fecha;

public class FechaDetallada extends Fecha{
    private static String meses[] ={"Enero",
                                    "Febrero",
                                    "Marzo",
                                    "Abril",
                                    "Mayo",
                                    "Junio",
                                    "Julio",
                                    "Agosto",
                                    "Septiembre",
                                    "Octubre",
                                    "Noviembre",
                                    "Diciembre"};
    public FechaDetallada(){

    }
    public FechaDetallada(int dia,int mes, int anio){
        super(dia,mes, anio);
    }

    public String toString(){
        return this.getDia()+" de "+meses[this.getMes()-1]+" de "+this.getAnio();

    }
    
    public void escribir(){
        System.out.println(super.toString());
    }

   

    
}
