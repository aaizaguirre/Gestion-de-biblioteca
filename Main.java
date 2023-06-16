public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("El gran Gatsby", "Fitzgerald, S.", 1925, true);
        
        Libro libro2 = new Libro("1984", "Orwell, G.", 1949, false);

        Libro libro3 = new Libro("Cien años de soledad", "García - Márquez, G.", 1967, true);

        System.out.println("Los cantidad de libros guardados en el registro es: " + Libro.getNumeroLibros());

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        libro3.mostrarInformacion();

        // libro1.setPrestado(true);
        // libro1.mostrarInformacion();

        // libro1.prestarLibro();
        // libro2.prestarLibro();

        // libro1.mostrarInformacion();
        // libro2.mostrarInformacion();

        // libro1.devolverLibro();
        // libro2.devolverLibro();

    }  

}
