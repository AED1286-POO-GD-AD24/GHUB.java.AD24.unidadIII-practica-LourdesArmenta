package figuras;

public class ObjGeometrico {
    protected double px,py; //miembros por omision (amigos)
    public ObjGeometrico(){
        px=0;
        py=0;
    }
    public ObjGeometrico(double x,double y){
        px=x;
        py=y;
    }
    public void imprimirCentro(){
        System.out.println("("+px+","+py+")");
    }


    
}
