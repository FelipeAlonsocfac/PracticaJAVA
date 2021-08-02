package clases;

public class Recursividad {
    public void Imprimir(int x){
        //para ciclarlo de manera controlada y no infinita, se hace lo siguiente

        if(x <= 5){
            System.out.print(x + " ");
            Imprimir(x + 1);
        }
    }// 1 2 3 4 5
}
