import java.util.Scanner;

public class BibliotecaCli {
    private Biblioteca biblioteca = new Biblioteca();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar() {
        int opcion = 0;
        do {
            System.out.println("\n=== Biblioteca Personal ===");
            System.out.println("1. Registrar libro");
            System.out.println("2. Buscar libro");
            System.out.println("3. Contar libros");
            System.out.println("4. Listar libros");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    biblioteca.registrarLibro(titulo);
                    System.out.println("Libro registrado correctamente.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del libro a buscar: ");
                    String libroBuscar = scanner.nextLine();
                    boolean encontrado = biblioteca.buscarLibro(libroBuscar);
                    if (encontrado) {
                        System.out.println("El libro fue encontrado.");
                    } else {
                        System.out.println("El libro no se encuentra en la biblioteca.");
                    }
                    break;
                case 3:
                    int total = biblioteca.contarLibros();
                    System.out.println("Total de libros registrados: " + total);
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}