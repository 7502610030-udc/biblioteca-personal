import java.util.ArrayList;

public class biblioteca {

    private ArrayList<String> libros =new ArrayList<>();

    public void registrarLibro(String titulo) {
        libros.add(titulo);
        System.out.println("[log] Guardando en la lista de memoria: " + titulo);
    }

    public boolean buscarLibro(String titulo){
        return false;
    }

    public int contraLibros(){
        return 0;
    }

    public void listarLibros(){
        
    }
    
}
