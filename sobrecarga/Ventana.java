package sobrecarga;
public class Ventana{
    public void copiar(Ventana w){
        System.out.println("metodo del padre con un Argumento : Ventana");

    }
    public void copiar(String p, int x, int y){
        System.out.println("metodo del padre con 3 Argumentos: String, int, int");

    }
    public void tipo(){
        System.out.println("Metodo de clase Ventana");
    }

}