package figuras;

public class Cuadrado extends ObjGeometrico{
    private double x1,y1;
    public Cuadrado(double xc,double yc, double t1, double t2){
        super(xc,yc);//llama al contructos de la clasea base
        x1=t1;
        y1=t2;
    }
    public double area(){
        double a,b;
        a = px-x1;
        b = py-y1;
        return 2*(a*a+b*b);

    }
    
}
