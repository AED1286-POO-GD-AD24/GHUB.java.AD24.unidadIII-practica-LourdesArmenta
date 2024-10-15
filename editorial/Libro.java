package editorial;

public class Libro extends Publicacion{
    private String autor;
    private String isbn;
    //constructor
    public Libro(){
        //invocar al constructor sin parametros del padre
        this.autor = "Sin Autor";
        this.isbn = "Sin ISBN";
    }
    

    public Libro(String autor, String isbn) {
        //invocar al constructor sin parametros del padre
        this.autor = autor;
        this.isbn = isbn;
    }

    public Libro(String editorial, String fecha, String autor, String isbn) {
        //invocar al constructor con dos parametros del padre
        super(editorial, fecha);
        this.autor = autor;
        this.isbn = isbn;
    }


    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    } 
    

    
}
