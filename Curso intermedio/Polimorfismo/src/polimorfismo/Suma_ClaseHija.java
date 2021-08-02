package polimorfismo;

public class Suma_ClaseHija extends Operaciones_ClasePadre{  //extends Operaciones_ClasePadre es para heredar la clase operaciones_clasepadre
    
    @Override     //para sobreescribir un metodo y asi usar el polimorfismo
    public void Operaciones(){
        resultado = valor1 + valor2;
    }

}
