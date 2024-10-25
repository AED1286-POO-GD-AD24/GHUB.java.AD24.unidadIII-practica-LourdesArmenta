package conversiones;

public class AlarmaDeBarcos {
    public static void main(String[] args) {
        Barco bs[] = new Barco[3]; //es un arreglo de 3 Barco
        DeVapor mss = new DeVapor();

        System.out.println();

        Velero vss = new Velero();
        Carguero css = new Carguero();

        bs[0] = mss;
        bs[1] = vss;
        bs[2]= css;
        for(int i=0;i<3;i++){
            bs[i].alarma();
            bs[i].alarma("principal");

            
        }


        




    }
    
}
