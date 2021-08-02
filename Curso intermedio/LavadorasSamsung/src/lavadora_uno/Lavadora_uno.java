package lavadora_uno;
import java.util.Scanner;

import Libreria.LLFunciones;  //importar el paquete creado anteriormente

public class Lavadora_uno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        int TipoDeRopa = entrada.nextInt();

        System.out.println("Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();

        LLFunciones funciones = new LLFunciones(kilos, TipoDeRopa);
        funciones.CicloFinalizado();
        funciones.set_TipoDeRopa(2);
        System.out.println( "El tipo de ropa es: " + funciones.get_TipoDeRopa());
        entrada.close();
    }
}
