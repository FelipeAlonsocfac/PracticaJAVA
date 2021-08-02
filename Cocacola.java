import java.util.Scanner;

public class Cocacola{
  public static void main (String args[]){
    
    Scanner teclado = new Scanner(System.in);
    String nombre = "";
    int clave = 0, antiguedad = 0;
    
    System.out.println("******************************************************");
    System.out.println("Bienvenido al sistema vacacional de Coca-Cola Company.");
    System.out.println("******************************************************");
    System.out.println("");
    System.out.println("");
    System.out.print("Cual es el nombre del trabajador?: ");
    nombre = teclado.nextLine();
    System.out.println("");

    System.out.print("Cuantos años de servicio tiene el trabajador?: ");
    antiguedad = teclado.nextInt();
    System.out.println("");

    System.out.print("Cual es la clave de su departamento?: ");
    clave = teclado.nextInt();
    System.out.println("");

    if (clave == 1){
      if (antiguedad>=0 && antiguedad<1){
        System.out.println(nombre + ", 0 dias de vacaciones");
      }
      else if (antiguedad>=1 && antiguedad<2){
        System.out.println(nombre + ", 6 dias de vacaciones");
      }
      else if (antiguedad>=2 && antiguedad<=6){
        System.out.println(nombre + ", 14 dias de vacaciones");
      }
      else if (antiguedad>6){
        System.out.println(nombre + ", 20 dias de vacaciones");
      }
    }
     
    else if (clave == 2){
      if (antiguedad>=0 && antiguedad<1){
        System.out.println(nombre + ", 0 dias de vacaciones");
      }
      if (antiguedad>=1 && antiguedad<2){
        System.out.println(nombre + ", 7 dias de vacaciones");
      }
      if (antiguedad>=2 && antiguedad<=6){
        System.out.println(nombre + ", 15 dias de vacaciones");
      }
      if (antiguedad>6){
        System.out.println(nombre + ", 22 dias de vacaciones");
      }
    }

    else if (clave == 3){
      if (antiguedad>=0 && antiguedad<1){
        System.out.println(nombre + ", 0 dias de vacaciones");
      }
      if (antiguedad>=1 && antiguedad<2){
        System.out.println(nombre + ", 10 dias de vacaciones");
      }
      if (antiguedad>=2 && antiguedad<=6){
        System.out.println(nombre + ", 20 dias de vacaciones");
      }
      if (antiguedad>6){
        System.out.println(nombre + ", 30 dias de vacaciones");
      }
    }
    
    else System.out.println("Error, clave del departamento incorrecta");       
  }
}