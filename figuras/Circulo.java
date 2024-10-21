package figuras;
/*
 * Un circulo se caracteza por su centro y su radio,mientras que una cuadrado
 * se caracteriza por su centro y uno de sus cuatro vértices, entoncs
 * las clases Circulo y Cuadrado se declaran derivadas de ObjGeometrico
 */

public class Circulo extends ObjGeometrico{
    private double radio;
    private final double PI=3.1426;
    public Circulo(double x, double y, double r){
        super(x,y); //llama al constructor del padre
        radio = r;
    }
    public double area(){
        return PI*radio*radio;
    }
    
}
