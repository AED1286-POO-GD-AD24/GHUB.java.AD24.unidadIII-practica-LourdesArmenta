package conversiones;
public class ClienteMainConversiones {
    public static void main(String[] args) {
        double k = 8.5;
        int v = (int)k;
        System.out.println("Valor de v "+v);

        @SuppressWarnings("deprecation")
        Integer g = new Integer(66);
        //Revista pb = (Revista)g; no es posible

        Barco mr;
        Velero va = new Velero();
        DeVapor dv = new DeVapor();
        mr = va; //converison automatica
        mr = dv; //converion automatica

        Carguero b1 = new Carguero();
        DeVapor wt;
        mr = b1;
        wt = b1;

        Velero velero;
        Barco barco = new Barco();
        //velero = barco; //esto no es posible porque velero en un subclase de barco

        Barco barco1;
        Velero v1 = new Velero();
        barco1 = v1; //esto es posible porque veloro es una subclase de barco

        







        



        
    }
    
}
