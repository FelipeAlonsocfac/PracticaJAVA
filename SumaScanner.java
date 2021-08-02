import java.util.Scanner;

public class SumaScanner{
  public static void main (String args[]){
    
    Scanner teclado = new Scanner(System.in);
    String nombre = "";
    int num_1 = 0, num_2 = 0, resultado = 0;
    
    System.out.println("¿Cual es tu nombre?");
    nombre = teclado.nextLine(); // si es un tipo entero el que recibe, debe poner teclado.nextInt
    
    System.out.println("Dame el primer valor para tu suma");
    num_1 = teclado.nextInt();
    System.out.println("Dame el segundo valor para tu suma");
    num_2 = teclado.nextInt();

    resultado = num_1 + num_2;
    System.out.println("Hola, " + nombre + ". El resultado de tu suma es: " + resultado);
  }
}