public class Biblioteca {
    private java.util.ArrayList<String> libros = new java.util.ArrayList<>();

    public void registrarLibro(String titulo) {
        libros.add(titulo);
        System.out.println("[LOG] Guardando en la lista en memoria: " + titulo);
    }

    public boolean buscarLibro(String titulo) {
        for (String libro : libros) {
            if (libro.equalsIgnoreCase(titulo)) {
                return true; 
            }
        }
        return false; 
    }

    public int contarLibros() {
            return libros.size();
        }
    }

    public void listarLibros() {
    } 
