package suma;
//ejecuta la parte logica del programa

import java.lang.reflect.Method;

public class Suma {
    private int v1, v2, resultado;
    
    public Suma(int val1, int val2){
        
        this.v1 = val1;    //this hace referencia a la clase que se esta usando actualmente
        this.v2 = val2;
    }
    public void Operacion(){
        resultado = v1 + v2;
    }
    public void Imprimir(){
        Operacion();
        System.out.println("El resultado de la suma es:" + resultado);

    }
}
