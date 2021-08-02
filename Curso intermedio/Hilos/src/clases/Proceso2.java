package clases;

public class Proceso2 implements Runnable {
    //esta es la segunda forma, es implementanto Runnable. La diferencia es que en la primera manera heredas y en esta implementas
    @Override
    public void run (){
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 2");//este es mi primer hilo.
        }
    }
}
