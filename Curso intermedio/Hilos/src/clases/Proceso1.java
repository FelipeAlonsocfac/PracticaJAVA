package clases;

public class Proceso1 extends Thread{
    //la primer manera es heredando una clase del jdk de java, en este caso se llama thread
    @Override
    public void run(){  //es un metodo heredado y abstracto por tanto se usa el override
        for(int i = 0; i <= 5; i++){
            System.out.println("Proceso 1");//este es mi primer hilo.
        }
    }
}
