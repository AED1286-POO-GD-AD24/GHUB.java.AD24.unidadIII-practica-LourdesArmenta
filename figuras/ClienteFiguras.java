package figuras;

public class ClienteFiguras {
    public static void main(String[] args) {
        Circulo cr = new Circulo(2.0, 2.5, 2.0);
        Cuadrado cd = new Cuadrado(3.0,3.5,26.37,3.85);
        System.out.println("Centro del circulo:");
        cr.imprimirCentro(); //es un metodo que pertene a la base y como es publica se hereda
        System.out.println("Centro de cuadrado:");
        cd.imprimirCentro();//es un metodo que pertenece a la base y como es publico se hereda
        System.out.println("Area del circulo: "+cr.area());
        System.out.println("Area de cuadrado. "+cd.area());
        


    }
    
}
