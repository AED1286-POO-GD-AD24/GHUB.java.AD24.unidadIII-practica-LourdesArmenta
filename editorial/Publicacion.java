package editorial;

public class Publicacion {
    private String editorial;
    private String fecha;
    public Publicacion() {
        this.editorial="sin editorial";
        this.fecha="sin fecha";
    }
    
    public Publicacion(String editorial, String fecha) {
        this.editorial = editorial;
        this.fecha = fecha;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
}
