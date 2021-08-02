package Operaciones;
import java.util.Scanner;

public class ClasePadre {
    
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){//pedir valores al usuario
        System.out.print("Dame el primer valor: ");
        valor1 = entrada.nextInt();
        
        System.out.print("Dame el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
