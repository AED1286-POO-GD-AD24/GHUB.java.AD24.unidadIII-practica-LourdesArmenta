package conversiones;

public class Barco { 
    
    public Barco(){
        System.out.println("Se crea una parte de un Barco");
    }
    public void alarma(){
        System.out.println("SOS desde un Barco");
    }
    public void alarma(String msg){
        System.out.println("\tMensaje: "+msg+" enviado desde un Barco");
    }
    
}
