import java.util.Scanner;

public class BibliotecaCli {
    private biblioteca biblioteca = new biblioteca();
    private Scanner scanner = new Scanner(System.in);

    public void iniciar(){
        int opcion = 0;
        do{
           System.out.println("\n=== Biblioteca Personal ===");
           System.out.println("1. Registrar Libro");
           System.out.println("2. Buscar Libro");
           System.out.println("3. Contar Libros");
           System.out.println("4. Listar Libros");
           System.out.println("5. Salir");
           System.out.print("Seleccione una opción: ");

           opcion = scanner.nextInt();
           scanner.nextLine(); 

           switch(opcion) {
               case 1:
                   System.out.print("Ingrese el titulo del libro: ");
                   String titulo = scanner.nextLine();
                   biblioteca.registrarLibro(titulo);
                   System.out.println("Libro registrado correctamente.");
                   break;
                case 2:
                    
                    break;

                case 3:
                    
                    break;
                case 4:

                    break;

                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.")
           }
        }while (opcion != 5);
    }
    
}
