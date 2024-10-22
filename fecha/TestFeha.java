package fecha;

public class TestFeha {
    
    public static void main(String[] args) {
        Fecha f = new Fecha();
        f.setAnio(2024);
        f.setMes(10);
        f.setDia(22);

        //Imprimimps el dia
        System.out.println("Dia ="+f.getDia());
        //imprimimos el mes
        System.out.println("Mes = "+f.getMes());
        //imprimos el año
        System.out.println("años = "+f.getAnio());

        System.out.println(f.toString());

        FechaDetallada f2 = new FechaDetallada();
        f2.setAnio(2024);
        f2.setMes(10);
        f2.setDia(20);

        System.out.println(f2.toString());
        f2.escribir();

        //polomosfismo
        Fecha f3 = new FechaDetallada(11,2,1968);
        Fecha f4 = new Fecha(11,2,2024);

        System.out.println(f3);
        System.out.println(f4);
        


        





        
    }
    
}
