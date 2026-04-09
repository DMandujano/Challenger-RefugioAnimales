import java.util.Scanner;

public class RefAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        System.out.println("=========Refugio animal=========");
        System.out.println("================================");
        System.out.println("1. Registrar un nuevo animal");
        System.out.println("2. Registrar especie");
        System.out.println("3. Marcar animal como adoptado");
        System.out.println("4. Mostrar animales disponibles");
        System.out.println("5. mostrar animales adoptados");        
        System.out.println("6.mostrar reporte general");
        System.out.println("7. Salir");
        System.out.print("Select an option: ");
        int opcion = sc.nextInt();
        //Switch moderno
        switch (opcion) {
            case 1 ->{
                System.out.print("Ingresa el nombre del animal: ");
                String nombre = sc.nextLine();
                System.out.print("Ingresa la edad del animal: ");
                int edad = sc.nextInt();
                System.out.print("Ingresa la especie del animal: ");
                String especie = sc.nextLine();
                System.out.print("Ingresa el estado del animal (disponible/adoptado):");
                String estado = sc.nextLine();
            }
            case 2 -> {
                System.out.print("Ingresa el nombre de la especie: ");
                String nombreEspecie = sc.nextLine();
                System.out.print("Ingresa la descripción de la especie: ");
                String descripcionEspecie = sc.nextLine();
            }
            case 3 -> {
                System.out.print("Ingresa el ID del animal a marcar como adoptado: ");
                int idAnimal = sc.nextInt();
            }
            case 4 -> {
                System.out.println("Animales disponibles:");
                // Aquí se mostrarían los animales disponibles
            }
            case 5 -> {
                System.out.println("Animales adoptados:");
                // Aquí se mostrarían los animales adoptados    
            }
            case 6 -> {
                System.out.println("Reporte general:");
                // Aquí se mostraría el reporte general
            }
            case 7 -> {
                System.out.println("Saliendo del programa...");
                System.exit(0);
            }
        }




        
        System.out.print("Enter the name of the animal: ");
        String name = sc.nextLine();
        System.out.print("Enter the age of the animal: ");
        int age = sc.nextInt(); 

    }
}
