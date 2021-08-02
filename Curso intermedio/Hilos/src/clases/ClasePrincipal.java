package clases;

public class ClasePrincipal {
    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1();    //esto es utilizando el extends Thread
        //tambien se puede hacer lo siguiente: Proceso1 hilo3 = new Proceso1();. Es un tercer hilo que hace lo mismo del primero pero puedo ejecutarlos a la vez
        Thread hilo2 = new Thread(new Proceso2());    //esto es utilizando el implements Runnable, se quiere usar lo que esta en la clase Thread
        //pero el proceso a ejecutar es el de la clase Proceso2

        hilo1.start();  //con esto, se inicia el hilo
        hilo2.start();  //para que los hilos funcionen de manera correcta, primero se inicializan los objetos o clases de dichos hilos y despues se inician

        //adicional: this.getname lo que hace es obtener el nombre de la clase utilizada. EJ: this.getname en la clase llamada proceso 1 y despues se llama en la principal
        //imprimiria en este caso un "hilo1"
    }
}
