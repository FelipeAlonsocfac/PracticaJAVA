package main;
import Operaciones.ClaseHija_Resta;
import Operaciones.ClaseHija_Suma;//importar clases de otros paquetes


public class ClasePrincipal {
    public static void main(String[] args) {
         
        ClaseHija_Suma mensajero_suma = new ClaseHija_Suma();   //se crea el objeto de otra clase
        mensajero_suma.PedirDatos();
        mensajero_suma.Sumar();
        System.out.print("El resultado de la suma es: ");
        mensajero_suma.MostrarResultado();

        ClaseHija_Resta mensajero_resta = new ClaseHija_Resta();
        mensajero_resta.PedirDatos();
        mensajero_resta.Restar();
        System.out.print("El resultado de la resta es: ");
        mensajero_resta.MostrarResultado();
    }
}
