public class Promedio{
  public static void main (String args[]){
    int mates = 5;
    int biol = 5;
    int quim = 7;
    int promedio = 0;
    
    promedio = (mates + biol + quim) / 3;
    if (promedio>=6) System.out.println("El alumno aprobo con " + promedio);
    else System.out.println("El alumno reprobo con " + promedio);
  }
}