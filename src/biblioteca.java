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
    

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
        }else{
            System.out.println("--- Lista de Libros ---");
            for (int i = 0; i < libros.size(); i++){
                System.out.println((i + 1) + ". " + libros.get(i));
            }
        }
    }
}