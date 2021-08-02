public class Operaciones{
  public static void main (String args[]) {
    
    int num_1 = 4;
    int num_2 = 4;
    int resultado = 0;
    
    resultado = num_1 + num_2 / 2;
    System.out.println("El resultado incorrecto es: " + resultado);
    
    resultado = (num_1 + num_2) / 2;
    System.out.println("El resultado correcto es: " + resultado);
  }
}