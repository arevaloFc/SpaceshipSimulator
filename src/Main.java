import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static Cargo naveEspacial;

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
        int aceleracion = scan.nextInt();
        scan.nextLine();
        naveEspacial = new Cargo(nombre,matriculaGalactica,aceleracion);
        System.out.println("\n" + "- - - - Opcion 1 Finalizada - - - -");
    }

    /*------------------------------------Mostrar nave espacial------------------------------------*/
    public static void mostrarNaveEspacial() {
        System.out.println(naveEspacial);
        System.out.println("\n" + "- - - - Opcion 2 Finalizada - - - -");
    }

    /*------------------------------------Acelerar nave espacial------------------------------------*/
    public static void AcelerarNaveEspacial() {
        System.out.print("\tIntroduce el numero de aceleracion de tu nave espacial: ");
        int aceleracion = scan.nextInt();
        scan.nextLine();
        System.out.println(naveEspacial.SpeedUp(aceleracion));
        System.out.println("\n" + "- - - - Opcion 3 Finalizada - - - -");
    }

    /*------------------------------------Frenar nave espacial------------------------------------*/
    public static void FrenarNaveEspacial() {
        System.out.print("\tIntroduce el numero para frenar tu nave espacial: ");
        int aceleracionFrenar = scan.nextInt();
        scan.nextLine();
        System.out.println("\tTu nave quedo en la posicion: " + naveEspacial.brake(aceleracionFrenar) );
        System.out.println("\n" + "- - - - Opcion 4 Finalizada - - - -");
    }

    /*--------------------------------------Parar tu nave espacial"------------------------------------*/
    public static void PararNaveEspacial(){
        System.out.println("\tTu nave espacial a parado de golpe su velocidad nueva es: " + naveEspacial.emergencyStop());
        System.out.println("\n" + "- - - - Opcion 5 Finalizada - - - -");
    }

    /*---------------------Agregar containers a la bodega de la nave espacial--------------------------*/
    public static void BodegaNaveEspacialAgregar(){
        System.out.print("\tCuantos containers quieres meter a la bodega de tu nave espacial: ");
        int meterContainer = scan.nextInt();
        scan.nextLine();
        System.out.println(naveEspacial.load(meterContainer));
        System.out.println("\n" + "- - - - Opcion 6 Finalizada - - - -");
    }

    /*---------------------Quitar containers a la bodega de la nave espacial--------------------------*/
    public static void BodegaNaveEspacialSacar(){
        System.out.print("\tCuantos containers quieres sacar de la bodega de tu nave espacial:");
        int meterContainer = scan.nextInt();
        scan.nextLine();
        System.out.println(naveEspacial.unload(meterContainer));
        System.out.println("\n" + "- - - - Opcion 7 Finalizada - - - -");
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
                    mostrarNaveEspacial();
                    break;
                case "3":
                    AcelerarNaveEspacial();
                    break;
                case "4":
                    FrenarNaveEspacial();
                    break;
                case "5":
                    PararNaveEspacial();
                    break;
                case "6":
                    BodegaNaveEspacialAgregar();
                    break;
                case "7":
                    BodegaNaveEspacialSacar();
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
