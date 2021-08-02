package main;
import Opciones.opciones;
import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        opciones OP = new opciones();
        Scanner entrada = new Scanner(System.in);

        while(true){
            System.out.println("\nPor favor, seleccione una opcion:\n" + 
                                    "\t1. Consulta de saldo\n" + 
                                    "\t2. Retiro de efectivo\n" +
                                    "\t3. Deposito de efectivo\n" +
                                    "\t4. Salir.\n");
            switch (entrada.nextInt()) {
                case 1:
                    System.out.println("Su saldo actual es: " + OP.getSaldo());
                    break;  
                case 2:
                    System.out.println("Cuanto desea retirar?");
                    OP.Retiro(entrada.nextInt());
                    break;
                case 3:
                    System.out.println("Cuanto desea depositar?");
                    OP.Deposito(entrada.nextInt());
                    break;
                case 4:
                    System.out.println("Gracias, vuelva pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion incorrecta.");
                    break;
            }
        }        
    }
}
