package miPrincipal;
import persona.*;


public class Principal {
   

    public static void main(String[] args) {

        //Ejemplo de Herencia con el paquete Persona
        Persona persona1 = new Persona();
        System.out.println("Nombre de Persona 1: "+persona1.getNombre());
        System.out.println("Edad de la persona 1: "+persona1.getEdad());

        persona1.setNombre("Juan");
        persona1.setEdad(15);

        System.out.println("Nombre de Persona 1: "+persona1.getNombre());
        System.out.println("Edad de la persona 1: "+persona1.getEdad());
        

        Persona persona2 = new Persona("Luis",18);
        System.out.println("Nombre de Persona 2: "+persona2.getNombre());
        System.out.println("Edad de la persona 2: "+persona2.getEdad());

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Paula");
        estudiante1.setEdad(20);
        estudiante1.setMatricula("202012345");

        System.out.println("Nombre de Estudiante 1:"+estudiante1.getNombre());
        System.out.println("Edad de Estudiante 1:"+estudiante1.getEdad());
        System.out.println("Matricula de Estudiante 1: "+estudiante1.getMatricula());
        estudiante1.saludo();

        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Ricardo");
        empleado1.setEdad(30);
        empleado1.setSalario(10000.00);

        System.out.println("Nombre de Empleado 1:"+empleado1.getNombre());
        System.out.println("Edad de Empleado 1: "+empleado1.getEdad());
        System.out.println("Sueldo de Empleado 1:"+empleado1.getSalario());
        empleado1.saludo();








        
    }
}