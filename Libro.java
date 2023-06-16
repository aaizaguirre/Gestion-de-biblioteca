public class Libro {
    
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private boolean prestado;
    private static int numeroLibros = 0;

    public Libro(String titulo, String autor, int añoPublicacion, boolean prestado){

        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.prestado = prestado;

        numeroLibros ++;
        
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAñoPublicacion(){
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion){
        this.añoPublicacion = añoPublicacion;
    }

    public boolean getPrestado(){
        return prestado;
    }

    public void setPrestado (boolean prestado){
        this.prestado = prestado;
    }

    public static int getNumeroLibros(){
        return numeroLibros;
    }

    // Método para prestar el libro
    public void prestarLibro(){
        if (prestado == true){
            System.out.println("El libro "+ titulo + " ha sido prestado.");
        }
        else {
            setPrestado(true);
            System.out.println("El libro " + titulo + " te será prestado.");
        }
    }

    // Método para devolver libro
    public void devolverLibro(){
        if (prestado == true){
            setPrestado(false);
            System.out.println("El libro " + titulo + " ha sido devuelto.");
        }
        else{
            System.out.println("El libro " + titulo + " no está prestado actualmente.");
        }
    }

    // Método para mostrar información del libro
    public void mostrarInformacion(){
        System.out.println("Titulo: " + titulo + ".");
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + añoPublicacion + ".");
        System.out.println("Estado: " + (prestado ? "Prestado": "Disponible") + ".");
    }

}