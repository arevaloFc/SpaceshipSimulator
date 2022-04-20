import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static SpaceShip naveEspacial;

    /*------------------------------------------------Menu--------------------------------------------*/
    public static String mostrarMenu() {

        System.out.println(". . . . . . Menu . . . . . .");
        System.out.println("1. Crear nave espacial.");
        System.out.println("2. Mostrar nave espacial.");
        System.out.println("3. Acelerar nave espacial");
        System.out.println("4. Frenar nave espacial.");
        System.out.println("5. Parar nave espacial");
        System.out.println("6. Agregar containers a la bodega de la nave espacial");
        System.out.println("7. Quitar containers a la bodega de la nave espacial");
        System.out.println("0 → Salir de la nave.");
        System.out.println("Hola capitan por favor elige una opción del menu anteriormente mostrado");

        String opcionUsuario = scan.nextLine();
        return opcionUsuario;
    }

    /*-------------------------------------Crear una nave espacial------------------------------------*/
    public static void crearNaveEspacial() {
        System.out.println("INTRODUCE LOS DATOS DE TU NUEVA NAVE ESPACIAL" + "\n");
        System.out.print("\t" + "Introduce el nombre de tu nave espacial: ");
        String nombre = scan.nextLine();
        System.out.print("\t" + "Introduce la matricula galactica de tu nave espacial: ");
        String matriculaGalactica = scan.nextLine();
        System.out.print("\t" + "Introduce la aceleracion de tu nave espacial: ");
        int aceleracioc = scan.nextInt();
        naveEspacial = new SpaceShip(nombre,matriculaGalactica,aceleracioc);
        System.out.println("\n" + "- - - - Opcion 1 Finalizada - - - -");
    }

    public static void main(String[] args) {
        String opcionUsuario = "";

        while (!opcionUsuario.equals("0")) {
            opcionUsuario = mostrarMenu();

            switch (opcionUsuario) {
                case "1":
                    crearNaveEspacial();
                    break;
                case "2":
                    System.out.println("Hola2");
                    break;
                case "3":
                    System.out.println("Hola3");
                    break;
                case "4":
                    System.out.println("Hola4");
                    break;
                case "5":
                    System.out.println("Hola5");
                    break;
                case "6":
                    System.out.println("Hola6");
                    break;
                case "7":
                    System.out.println("Hola7");
                    break;
                case "0":
                    System.out.println("Estas Muerto :D");
                    break;
                default:
                    System.out.println("Por favor escoja una opcion de 1 al 7 o 0 para salir gracias");
                    break;
            }
        }
    }

}
