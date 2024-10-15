package miPrincipal;
import persona.*;
import editorial.*;


public class Principal {
   

    public static void main(String[] args) {
        /* 

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
        */
        
        Publicacion publicacion1 = new Publicacion();

        System.out.println("Editorial de publicacion: "+publicacion1.getEditorial());
        System.out.println("Fecha de publicacion: "+publicacion1.getFecha());

        Revista revista1 = new Revista();
        System.out.println("Editorial de la revista:"+revista1.getEditorial());
        System.out.println("Fecha de la Publicacion :"+revista1.getFecha());
        System.out.println("Numero de publicaciones por año: "+revista1.getNumPorAnio());
        System.out.println("Numero de ejemplares en circulacion: "+revista1.getCirculacion());

        Libro libro1 = new Libro();
        System.out.println("Editorial del Libro: "+libro1.getEditorial());
        System.out.println("Fecha de publicacion: "+libro1.getFecha());
        System.out.println("Autor del libro: "+libro1.getAutor());
        System.out.println("ISBN del libro: "+libro1.getIsbn());

        System.out.println();

        Revista revista2 = new Revista(12,500);
        System.out.println("Editorial de la revista:"+revista2.getEditorial());
        System.out.println("Fecha de la Publicacion :"+revista2.getFecha());
        System.out.println("Numero de publicaciones por año: "+revista2.getNumPorAnio());
        System.out.println("Numero de ejemplares en circulacion: "+revista2.getCirculacion());

        System.out.println();
        Revista revista3 = new Revista("ALfaOmega","24/12/2000",6,300);
        System.out.println("Editorial de la revista:"+revista3.getEditorial());
        System.out.println("Fecha de la Publicacion :"+revista3.getFecha());
        System.out.println("Numero de publicaciones por año: "+revista3.getNumPorAnio());
        System.out.println("Numero de ejemplares en circulacion: "+revista3.getCirculacion());















        
    }
}