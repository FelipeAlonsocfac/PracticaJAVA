package polimorfismo;
import java.util.Scanner;

public abstract class Operaciones_ClasePadre {
    protected int valor1, valor2, resultado;   //es mejor usar protected cuando se va a utilizar herencia
    Scanner entrada = new Scanner(System.in);

    public void PedirDatos(){
        System.out.print("\nDame el primer valor: ");
        valor1 = entrada.nextInt();

        System.out.print("Dame el segundo valor: ");
        valor2   = entrada.nextInt();
    }

    public abstract void Operaciones();  //para usar el polimorfismo a los metodos debe agregarse la palabra abstract. tanto el metodo como la clase debe ser abstract
    //la clase abstracta nos permite solo declarar el metodo, sin crearlo. En este caso el metodo es Operaciones

    public void MostrarResultado(){
        System.out.print(resultado);

    }
}
