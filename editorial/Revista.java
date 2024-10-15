package editorial;

public class Revista extends Publicacion{
    private int numPorAnio;
    private long circulacion;
    //Pendiente constructor
    public Revista(){
        //invocar al constructor sin parametros del padre
        this.numPorAnio = 12;
        this.circulacion = 0;
    }
    public Revista(int numPorAnio, long circulacion){
        //invocar al constructor sin parametros del padre
        this.numPorAnio = numPorAnio;
        this.circulacion = circulacion;
    }
    public Revista(String editorial, String fecha,int numPorAnio, long circulacion){
        //invocar al constructor con dos parametros del padre
        super(editorial, fecha);
        this.numPorAnio=numPorAnio;
        this.circulacion=circulacion;
        

    }

    public int getNumPorAnio() {
        return numPorAnio;
    }
    public void setNumPorAnio(int numPorAnio) {
        this.numPorAnio = numPorAnio;
    }
    public long getCirculacion() {
        return circulacion;
    }
    public void setCirculacion(long circulacion) {
        this.circulacion = circulacion;
    }

    

    
}
