public class Biblioteca {
    // Usamos la ruta completa de Java para no tener que usar la palabra 'import'
    private java.util.ArrayList<String> libros = new java.util.ArrayList<>();

    // Módulo 1: Registrar libro
    public void registrarLibro(String titulo) {
        libros.add(titulo);
        System.out.println("[LOG] Guardando en la lista en memoria: " + titulo);
    }

    // Módulo 2: Buscar libro
    public boolean buscarLibro(String titulo) {
        for (String libro : libros) {
            if (libro.equalsIgnoreCase(titulo)) {
                return true; 
            }
        }
        return false; 
    }

    // Módulo 3
    public int contarLibros() {
        return 0;
    }

    // Módulo 4
    public void listarLibros() {
        // Se programará en su rama correspondiente
    }
} 
